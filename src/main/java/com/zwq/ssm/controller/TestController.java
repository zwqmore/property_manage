package com.zwq.ssm.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zwq.ssm.constant.PropertyMsg;
import org.springframework.web.bind.annotation.*;

/**
 * description: 测试
 *
 * @author zwq
 * @date 2021/12/20 9:31
 */
@RestController
public class TestController {

	@RequestMapping(value = "/test1", method = RequestMethod.POST)
	public Object test1(@RequestParam String s, @RequestBody JSONPObject jsonpObject) {
		System.out.println("s"+s);
		System.out.println(jsonpObject.toString());
		return PropertyMsg.ok("hello");
	}

	@RequestMapping(value = "/test2", method = RequestMethod.POST)
	@ResponseBody
	public Object test2(String s) {
		System.out.println(s);
		return PropertyMsg.ok("hello");
	}

}
