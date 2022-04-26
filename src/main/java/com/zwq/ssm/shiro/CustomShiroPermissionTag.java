package com.zwq.ssm.shiro;

import com.zwq.ssm.comm.Cons;
import com.zwq.ssm.dt.UserDT;
import com.zwq.ssm.pojo.Permission;
import com.zwq.ssm.pojo.User;
import org.apache.shiro.web.tags.PermissionTag;

import java.util.List;

/**
 * 客户端权限标签类<br>
 *
 * @author luoyh
 * @date May 28, 2015
 */
public class CustomShiroPermissionTag extends PermissionTag {

	private static final long serialVersionUID = 1L;

	String pers;

	public void setPers(String pers) {
		this.pers = pers;
	}

	public void setName(String name) {
		super.setName(pers);
	}

	@Override
	public String getName() {
		return pers;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected boolean showTagBody(String pers) {
		System.out.println("psers:"+pers);
		UserDT user = (UserDT) getSubject().getSession().getAttribute(Cons.USER_SESSION_ID);
		if (null == user) {
			return false;
		}
		// 2018-10-30 加载用户登录时存储的当前系统所有权限SYSTEM_PERMISSION
		List<Permission> systemPermissionList = (List<Permission>) ((UserDT) getSubject().getSession().getAttribute(Cons.USER_SESSION_ID)).getPers();
		if (null == systemPermissionList || systemPermissionList.isEmpty()) {
			return false;
		}

		String[] perms = pers.split(",");

		// 判断当前资源权限是否在本系统被授权
		if (perms == null || perms.length == 0) return false;
		for (String per : perms) {
			boolean isEnable = false;
			for (Permission permission : systemPermissionList) {
				if (permission.getCode().equals(per)) {
					System.out.println("拥有权限");
					isEnable = true;
					break;
				}
			}
			if (!isEnable) return false;
		}

		for (String per : perms) {
			if (!per.isEmpty() && getSubject().isPermitted(per.trim())) {
				return true;
			}
		}
		return false;
	}

}
