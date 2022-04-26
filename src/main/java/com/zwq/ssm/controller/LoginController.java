package com.zwq.ssm.controller;

import com.zwq.ssm.comm.Cons;
import com.zwq.ssm.constant.PropertyMsg;
import com.zwq.ssm.pojo.User;
import com.zwq.ssm.pojo.UserExample;
import com.zwq.ssm.service.UserService;
import com.zwq.ssm.vo.UserVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/15 13:52
 */
@RestController
public class LoginController extends BaseController{

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login.do", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public PropertyMsg login(String username, String password, HttpServletRequest request) {
		System.out.println("登录");
		PropertyMsg propertyMsg = null;
		logger.info("username:"+username+" password:"+password);
		System.out.println("username:"+username+"password:"+password);
		try {
			SecurityUtils.getSubject().login(
					new UsernamePasswordToken(username, DigestUtils.md5DigestAsHex(password.getBytes())));
			UserExample userExample = new UserExample();
			userExample.createCriteria().andUsernameEqualTo(username);
			UserVO user = userService.selectVOByExample(userExample).get(0);
			propertyMsg = PropertyMsg.ok(user);
			logger.info("成功");
		} catch (UnknownAccountException uae) {
			propertyMsg = PropertyMsg.wrong("账号不存在");
		} catch (IncorrectCredentialsException ice) {
			propertyMsg = PropertyMsg.wrong("密码错误");
		} catch (LockedAccountException lae) {
			propertyMsg = PropertyMsg.wrong("账户不存在，请联系管理员");
		} catch (AuthenticationException ae) {
			propertyMsg = PropertyMsg.wrong("认证错误");
			System.out.println("认证错误");
		}

		return propertyMsg;
	}

}
