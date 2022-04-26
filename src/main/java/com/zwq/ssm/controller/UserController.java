package com.zwq.ssm.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zwq.ssm.comm.Cons;
import com.zwq.ssm.constant.PropertyMsg;
import com.zwq.ssm.exception.AuthenticateException;
import com.zwq.ssm.mapper.UserMapper;
import com.zwq.ssm.pojo.User;
import com.zwq.ssm.pojo.UserExample;
import com.zwq.ssm.pojo.Village;
import com.zwq.ssm.service.UserService;
import com.zwq.ssm.vo.UserVO;
import javafx.scene.web.PromptData;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.Relation;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/2 10:14
 */
@RequestMapping("/user")
@RestController
public class UserController extends BaseController{
	@Autowired
	private UserService userService;

	@RequiresPermissions(value = {":user:add"})
	@RequestMapping(value = "/insertUser", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public Object insertVillage(String username, String realname, String phone, Integer role,Integer village, HttpServletRequest request) {
		System.out.println("username"+username+"village:"+village);
		if(username == null || realname == null || phone == null || role == null
				|| village == null){
			return PropertyMsg.wrong("参数异常");
		}

		if(username.length() <5 || username.length() > 10) {
			return PropertyMsg.wrong("账户长度有误");
		}

		if(realname.length() <2 || realname.length() > 10) {
			return PropertyMsg.wrong("姓名长度有误");
		}

		if(phone.length() != 11) {
			return PropertyMsg.wrong("手机号码有误");
		}

		if(!userService.validUsername(username)) {
			return PropertyMsg.wrong("账户已存在");
		}

		if(!userService.validPhone(phone)) {
			return PropertyMsg.wrong("电话号码重复");
		}

		User user = new User();
		user.setUsername(username);
		user.setRealname(realname);
		user.setPassword(DigestUtils.md5DigestAsHex(Cons.DEFAULT_PASS.getBytes()));
		user.setPhone(phone);
		user.setType((byte) 0);
		user.setVillageid(village);
		user.setRoleid(role);
		user.setCreatetime(new Date());
		user.setModifytime(new Date());
		user.setAvailable((byte) 0);
		user.setTuserid(0);

		System.out.println("添加的user:"+user.toString());
		userService.insert(user);
		return PropertyMsg.ok();
	}

	@RequiresPermissions(value = {":user:list"})
	@RequestMapping(value = "/allUser", method = RequestMethod.GET)
	public PropertyMsg listUsersAll(HttpServletRequest request, @RequestParam Integer page, @RequestParam Integer limit,
						@RequestParam(required = false) String username, @RequestParam(required = false) String realname) {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		if(username != null && username != "") {
			criteria.andUsernameLike("%"+username+"%");
		}
		if(realname != null && realname != "") {
			criteria.andRealnameLike("%"+realname+"%");
		}
		System.out.println("page:"+page+" li:"+limit);

		PageHelper.startPage(page,limit);
		List<UserVO> userlist = userService.selectVOByExampleWithPage(userExample);
		PageInfo<UserVO> info = new PageInfo<>(userlist);

		System.out.println("list大小："+userlist.size());
		System.out.println(info.toString());
		return new PropertyMsg(0, (int) info.getTotal(),userlist,"成功");
	}

	@RequiresPermissions(value = {":user:basic:update"})
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public Object listUsersAll(Integer id, String username, String realname, String password, String phone, HttpServletRequest request) {
		System.out.println("fsaf");
		System.out.println("id"+id+"user:"+username+" real:"+realname+" phone"+phone+" p:"+password);
		if(id == null || username == null || phone == null){
			return PropertyMsg.wrong("参数异常");

		}
		if(!userService.isExistUserById(id)) {
			return PropertyMsg.wrong("用户不存在");
		}
		if(password != null && password !="") {
			if(password.length() < 6 || password.length() > 12) {
				return PropertyMsg.wrong("密码不规范");
			}
		}

		if(username.length() <5 || username.length() > 10) {
			return PropertyMsg.wrong("长度有误");
		}

		if(phone.length() != 11) {
			return PropertyMsg.wrong("手机号有误");
		}

		User user = userService.selectByPrimaryKey(id);

		if(username.equals(user.getUsername())) {} else {
			if(!userService.validUsername(username)) {
				return PropertyMsg.wrong("账户已存在");
			}
			user.setUsername(username);
		}
		user.setRealname(realname);
		if(password != null && password !="") {
			user.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()));
		}
		if(phone.equals(user.getPhone())) {} else {
			if(!userService.validPhone(phone)) {
				return PropertyMsg.wrong("电话号码重复");
			}
			user.setPhone(phone);
		}

		userService.updateUserByPrimaryKey(user);
		return PropertyMsg.ok();
	}

	@RequiresPermissions(value = {":user:del"})
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public Object deleteUser(Integer id, HttpServletRequest request) {
		System.out.println("id"+id);
		if(id == null){
			return PropertyMsg.wrong("参数异常");
		}
		if(!userService.isExistUserById(id)) {
			return PropertyMsg.wrong("用户不存在");
		}
		userService.deleteUserByPrimaryKey(id);
		return PropertyMsg.ok();
	}

}
