package com.zwq.ssm.controller;

import com.zwq.ssm.comm.Cons;
import org.apache.shiro.SecurityUtils;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * description: 初始化菜单
 *
 * @author zwq
 * @date 2021/12/17 14:49
 */
@RestController
public class initController extends BaseController{

	@RequestMapping(value = "/init",method = RequestMethod.GET, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public String initMenu(Integer id, HttpServletRequest request) {
//		int roleType = id;
		int roleType = getSessionUser(request).getType();
		System.out.println("type;"+roleType);
		if (roleType == Cons.MANAGER) {
			return "{\n" +
					"  \"homeInfo\": {\n" +
					"    \"title\": \"首页\",\n" +
					"    \"href\": \"welcome?t=1\"\n" +
					"  },\n" +
					"  \"logoInfo\": {\n" +
					"    \"title\": \"LAYUI\",\n" +
					"    \"image\": \"images/logo.png\",\n" +
					"    \"href\": \"\"\n" +
					"  },\n" +
					"  \"menuInfo\": [\n" +
					"    {\n" +
					"      \"title\": \"管理\",\n" +
					"      \"icon\": \"fa fa-address-book\",\n" +
					"      \"href\": \"\",\n" +
					"      \"target\": \"_self\",\n" +
					"      \"child\": [\n" +
					"\t\t{\n" +
					"\t\t  \"title\": \"主页\",\n" +
					"\t\t  \"href\": \"welcome\",\n" +
					"\t\t  \"icon\": \"fa fa-tachometer\",\n" +
					"\t\t  \"target\": \"_self\"\n" +
					"\t\t},\n" +
					"        {\n" +
					"          \"title\": \"用户管理\",\n" +
					"          \"href\": \"\",\n" +
					"          \"icon\": \"fa fa-calendar\",\n" +
					"          \"target\": \"_self\",\n" +
					"          \"child\": [\n" +
					"            {\n" +
					"              \"title\": \"添加用户\",\n" +
					"              \"href\": \"addUser\",\n" +
					"              \"icon\": \"fa fa-list-alt\",\n" +
					"              \"target\": \"_self\"\n" +
					"            },\n" +
					"            {\n" +
					"              \"title\": \"用户列表\",\n" +
					"              \"href\": \"userList\",\n" +
					"              \"icon\": \"fa fa-navicon\",\n" +
					"              \"target\": \"_self\"\n" +
					"            }\n" +
					"          ]\n" +
					"        },\n" +
					"        {\n" +
					"          \"title\": \"小区管理\",\n" +
					"          \"href\": \"\",\n" +
					"          \"icon\": \"fa fa-dot-circle-o\",\n" +
					"          \"target\": \"_self\",\n" +
					"          \"child\": [\n" +
					"            {\n" +
					"              \"title\": \"添加小区\",\n" +
					"              \"href\": \"addVillage\",\n" +
					"              \"icon\": \"fa fa-list-alt\",\n" +
					"              \"target\": \"_self\"\n" +
					"            },\n" +
					"            {\n" +
					"              \"title\": \"小区列表\",\n" +
					"              \"href\": \"villageList\",\n" +
					"              \"icon\": \"fa fa-navicon\",\n" +
					"              \"target\": \"_self\"\n" +
					"            }\n" +
					"          ]\n" +
					"        },\n" +
					"        {\n" +
					"          \"title\": \"设备管理\",\n" +
					"          \"href\": \"\",\n" +
					"          \"icon\": \"fa fa-rocket\",\n" +
					"          \"target\": \"_self\",\n" +
					"          \"child\": [\n" +
					"            {\n" +
					"              \"title\": \"设备列表\",\n" +
					"              \"href\": \"deviceList\",\n" +
					"              \"icon\": \"fa fa-navicon\",\n" +
					"              \"target\": \"_self\"\n" +
					"            }\n" +
					"          ]\n" +
					"        }\n" +
					"      ]\n" +
					"    }\n" +
					"  ]\n" +
					"}";
		} else {
			if( roleType == Cons.PROPERTY) {
				return "{\n" +
						"  \"homeInfo\": {\n" +
						"    \"title\": \"首页\",\n" +
						"    \"href\": \"welcome?t=1\"\n" +
						"  },\n" +
						"  \"logoInfo\": {\n" +
						"    \"title\": \"LAYUI\",\n" +
						"    \"image\": \"images/logo.png\",\n" +
						"    \"href\": \"\"\n" +
						"  },\n" +
						"  \"menuInfo\": [\n" +
						"    {\n" +
						"      \"title\": \"管理\",\n" +
						"      \"icon\": \"fa fa-address-book\",\n" +
						"      \"href\": \"\",\n" +
						"      \"target\": \"_self\",\n" +
						"      \"child\": [\n" +
						"\t\t{\n" +
						"\t\t  \"title\": \"主页\",\n" +
						"\t\t  \"href\": \"welcome\",\n" +
						"\t\t  \"icon\": \"fa fa-tachometer\",\n" +
						"\t\t  \"target\": \"_self\"\n" +
						"\t\t},\n" +
						"        {\n" +
						"          \"title\": \"小区管理\",\n" +
						"          \"href\": \"\",\n" +
						"          \"icon\": \"fa fa-dot-circle-o\",\n" +
						"          \"target\": \"_self\",\n" +
						"          \"child\": [\n" +
						"            {\n" +
						"              \"title\": \"小区列表\",\n" +
						"              \"href\": \"villageList\",\n" +
						"              \"icon\": \"fa fa-navicon\",\n" +
						"              \"target\": \"_self\"\n" +
						"            }\n" +
						"          ]\n" +
						"        },\n" +
						"        {\n" +
						"          \"title\": \"设备管理\",\n" +
						"          \"href\": \"\",\n" +
						"          \"icon\": \"fa fa-rocket\",\n" +
						"          \"target\": \"_self\",\n" +
						"          \"child\": [\n" +
						"            {\n" +
						"              \"title\": \"设备列表\",\n" +
						"              \"href\": \"deviceList\",\n" +
						"              \"icon\": \"fa fa-navicon\",\n" +
						"              \"target\": \"_self\"\n" +
						"            }\n" +
						"          ]\n" +
						"        }\n" +
						"      ]\n" +
						"    }\n" +
						"  ]\n" +
						"}\n" +
						"\n" +
						"\n";
			}
		}
		return "";
	}

}
