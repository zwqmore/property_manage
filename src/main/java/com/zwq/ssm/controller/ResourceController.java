package com.zwq.ssm.controller;

import com.zwq.ssm.dt.UserDT;
import com.zwq.ssm.pojo.Permission;
import com.zwq.ssm.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/7 16:52
 */
@Controller
public class ResourceController extends BaseController {

	private final Logger log = LoggerFactory.getLogger(ResourceController.class);


	@RequestMapping(value = "/")
	public String global(ModelMap model, HttpServletRequest request) {
		System.out.println("根据条件跳转");
		log.info("根据条件跳转");
		// 在session中获取登录用户对象
		Object object = super.getObject();
		// 判断登录用户
		if (object != null && object instanceof UserDT) {} else {
			System.out.println("未登录，返回登录页");
			removeSession(request);
			return "login";
		}
		System.out.println("跳转到main");
		return "index";
	}

}
