package com.zwq.ssm.shiro;

import com.zwq.ssm.comm.Cons;
import com.zwq.ssm.dt.UserDT;
import com.zwq.ssm.pojo.Permission;
import com.zwq.ssm.pojo.User;
import com.zwq.ssm.service.PermissionService;
import com.zwq.ssm.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * description: 自定义realm类
 * @author zwq
 * @date 2021/12/15 10:23
 */
public class CustomShiroRealm extends AuthorizingRealm {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	@Autowired
	private PermissionService permissionService;

	@Override
	protected void onInit() {
		super.onInit();
	}

	@Override
	public boolean isPermitted(PrincipalCollection principals, String permission) {
		UserDT user = (UserDT) SecurityUtils.getSubject().getSession().getAttribute(Cons.USER_SESSION_ID);
		if(user.getRoleid() == Cons.USER_ADMIN) {
			return true;
		}
		return super.isPermitted(principals, permission.replaceAll(":", "#"));
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		//String loginName = (String) principalCollection.fromRealm(getName()).iterator().next();
		// 到数据库查是否有此对象
		//User user = userService.findByName(loginName);
		System.out.println("授权");
		UserDT userDT = (UserDT) SecurityUtils.getSubject().getSession().getAttribute(Cons.USER_SESSION_ID);
		if (userDT != null) {
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			if(userDT.getRoleid() != Cons.USER_ADMIN) {
				System.out.println("权限");
				List<Permission> pers = userDT.getPers();
				if(null != pers && !pers.isEmpty()) {
					for(Permission per : pers) {
						if(!per.getCode().isEmpty()) {
							info.addStringPermission(per.getCode().replaceAll(":", "#"));
						}
					}
				}
			} else {
				info.addStringPermission(Cons.AUTH_ALL);
			}
			info.addStringPermission(Cons.AUTH_NORMAL);
			return info;
		}
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		logger.info("登录");
		System.out.println("登录");
		// UsernamePasswordToken对象用来存放提交的登录信息
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		System.out.println("token:"+token.toString());
		logger.info("token:"+token.toString());
		User user = null;
		// 查出是否有此用户
		user = userService.selectByUsername(token.getUsername());
		if (null != user) {
			/*user.setHost(User.HOST_BG);*/
		} else {
			System.out.println("没有此用户");
			throw new UnknownAccountException();
		}
		if (user != null) {
			// 验证用户是否有效
			UserDT userDT = new UserDT();
			BeanUtils.copyProperties(user, userDT);
			userDT.setUserId(user.getId());
			userDT.setRoleid(user.getRoleid());
			logger.info("userDT:"+userDT.toString());
			System.out.println("userDT:"+userDT.toString());
			if (userDT.getAvailable() != 0) {
				throw new LockedAccountException("账户无效!");
			} else if (userDT.getPassword().equals(String.valueOf(token.getPassword()))) {
				if(userDT.getRoleid() != Cons.USER_ADMIN) {
					System.out.println("bushi");
					userDT.setPers(permissionService.selectListsByRoleid(userDT.getRoleid()));
				}else {
					userDT.setPers(permissionService.selectListsAll());
				}
				// 保存登陆用户Session，并设置session有时间(ms)
				setSession(Cons.USER_SESSION_ID, userDT, 1800000);
				// 2018-10-30 用户登录时加载当前系统所有权限
				setSession(Cons.SYSTEM_PERMISSION, permissionService.selectListsAll(), 1800000);
				System.out.println("other");
			}
			// 若存在，将此用户存放到登录认证info中
			System.out.println("fanhui");
			return new SimpleAuthenticationInfo(userDT.getUsername(), userDT.getPassword(), getName());
		}

		return null;
	}

	private void setSession(Object key, Object value, long time) {
		System.out.println("1");
		Subject currentUser = SecurityUtils.getSubject();
		System.out.println("2");
		/*System.out.println("currentUser:"+currentUser.toString());*/
		if (null != currentUser) {
			Session session = currentUser.getSession();
			System.out.println("3");
			// 设置session有效期
			session.setTimeout(time);
			System.out.println("4");
			if (null != session) {
				/*System.out.println("session:"+session.toString());
				System.out.println("6");
				System.out.println("key:"+key+"value:"+value);*/
				session.setAttribute(key, value);
				System.out.println("5");
			}
		}
		System.out.println("over");
	}
}
