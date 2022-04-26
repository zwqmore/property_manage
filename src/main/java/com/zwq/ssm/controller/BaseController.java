package com.zwq.ssm.controller;

import com.zwq.ssm.comm.Cons;
import com.zwq.ssm.dt.UserDT;
import com.zwq.ssm.exception.InvalidSessionException;
import com.zwq.ssm.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author luoyh
 * @date Mar 20, 2015
 */
@Controller
public class BaseController {

	public UserDT getSessionUser(HttpServletRequest request) {
		return (UserDT) request.getSession().getAttribute(Cons.USER_SESSION_ID);
	}

	public void setSessionObject(String key, Object value, HttpServletRequest request) {
		request.getSession().setAttribute(key, value);
	}

	public void removeSession(HttpServletRequest request) {
		request.getSession().removeAttribute(Cons.USER_SESSION_ID);
		getSession().removeAttribute(Cons.USER_SESSION_ID);
	}

	/**
	 * 获取当前登录用户对象
	 * @return
	 */
	public UserDT getTarget() {
		return (UserDT) getSession().getAttribute(Cons.USER_SESSION_ID);
	}

	public Object getObject() {
		return getSession().getAttribute(Cons.USER_SESSION_ID);
	}

	public Subject getSubject() {
		return SecurityUtils.getSubject();
	}

	public Session getSession() {
		return getSession(true);
	}

	public Session getSession(boolean flag) {
		return getSubject().getSession(flag);
	}


	public UserDT getSubjectUser() {
		UserDT userDT = getTarget();
		if(null == userDT) {
			throw new InvalidSessionException();
		}
		return userDT;
	}


}
