package com.zwq.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zwq.ssm.comm.Cons;
import com.zwq.ssm.constant.PropertyMsg;
import com.zwq.ssm.dt.UserDT;
import com.zwq.ssm.pojo.*;
import com.zwq.ssm.service.UserService;
import com.zwq.ssm.service.VillageService;
import com.zwq.ssm.vo.UserVO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping(value = "/village")
public class VillageController extends BaseController{
	@Autowired
	private VillageService villageService;

	@RequiresPermissions(value = {":village:addVillage"})
	@RequestMapping(value = "/insertVillage", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public Object insertVillage(String villageName, String province, Integer provinceCode, String city, Integer cityCode
			, String county, Integer countyCode, String street, Integer streetId, HttpServletRequest request) {
		System.out.println("street"+street+"villagename:"+villageName);
		if(villageName == null || provinceCode == null || cityCode == null || countyCode == null
			|| streetId == null){
			return PropertyMsg.wrong("参数异常");
		}

		if(villageName.length() <5 || villageName.length() > 20) {
			return PropertyMsg.wrong("长度有误");
		}
		Village village = new Village();
		village.setVillagename(villageName);
		village.setStateid(provinceCode);
		village.setStatename(province);
		village.setCityid(cityCode);
		village.setCityname(city);
		village.setCountyid(countyCode);
		village.setCountyname(county);
		village.setStreetid(streetId);
		village.setStreetname(street);
		village.setUpdatetime(new Date());
		village.setStatus((byte) 0);
		village.setVs((byte) 0);
		System.out.println("sesesese");
		village.setUserid(getSessionUser(request).getUserId());
		System.out.println("添加的village"+village.toString());
		villageService.insertVillage(village);
		return PropertyMsg.ok();
	}

	@RequiresPermissions(value = {":village:listview"})
	@RequestMapping("/getAll")
	public PropertyMsg listUsersAll(HttpServletRequest request, @RequestParam Integer page, @RequestParam Integer limit,
		@RequestParam(required = false) String villageName, @RequestParam(required = false) String cityName) {
		VillageExample villageExample = new VillageExample();
		VillageExample.Criteria criteria = villageExample.createCriteria();
		if(villageName != null && !"".equals(villageName)) {
			criteria.andVillagenameLike("%"+villageName+"%");
		}
		if(cityName != null && cityName != "") {
			criteria.andCitynameLike("%"+cityName+"%");
		}
		System.out.println("page:"+page+" li:"+limit);
		System.out.println(getSessionUser(request).toString());
		if( getSessionUser(request).getRoleid() != Cons.USER_ADMIN) {
			int villageId = getSessionUser(request).getVillageid();
			criteria.andIdEqualTo(villageId);
		}

		PageHelper.startPage(page,limit);
		List<Village> villageList = villageService.selectByExampleWithPage(villageExample);
		PageInfo<Village> info = new PageInfo<>(villageList);

		System.out.println("list大小："+villageList.size());
		System.out.println(info.toString());

		return new PropertyMsg(0, (int) info.getTotal(),villageList,"成功");
	}

	@RequiresPermissions(value = {":village:update"})
	@RequestMapping(value = "/updateVillage", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public Object listVillageAll(Integer id, String villageName, HttpServletRequest request) {
		System.out.println("id"+id+"name:"+villageName);
		if(id == null || villageName == null){
			return PropertyMsg.wrong("参数异常");

		}
		if(!villageService.isExistVillageById(id)) {
			return PropertyMsg.wrong("小区不存在");
		}

		if(villageName.length() <5 || villageName.length() > 20) {
			return PropertyMsg.wrong("长度有误");
		}

		Village village = villageService.selectByPrimaryKey(id);

		village.setVillagename(villageName);
		village.setUpdatetime(new Date());
		villageService.updateByPrimaryKey(village);
		return PropertyMsg.ok();
	}

	@RequiresPermissions(value = {":village:del"})
	@RequestMapping(value = "/deleteVillage", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public Object deleteVillage(Integer id, HttpServletRequest request) {
		System.out.println("id"+id);
		if(id == null){
			return PropertyMsg.wrong("参数异常");
		}
		if(!villageService.isExistVillageById(id)) {
			return PropertyMsg.wrong("小区不存在");
		}
		villageService.deleteVillageByPrimaryKey(id);
		return PropertyMsg.ok();
	}

	@RequestMapping(value = "/getVillageList", method = RequestMethod.GET)
	public PropertyMsg listUsersAll(HttpServletRequest request, @RequestParam String cityCode, @RequestParam String countyCode
			, @RequestParam String streetId) {
		boolean isParam = (cityCode == null || "".equals(cityCode)) && (countyCode == null || "".equals(countyCode))
				&& (streetId == null || "".equals(streetId));

		if(isParam) {
			System.out.println("参数异常");
			return PropertyMsg.wrong("参数异常");
		}
		VillageExample villageExample = new VillageExample();
		VillageExample.Criteria criteria = villageExample.createCriteria();
		List<Village> lists;

		if(streetId != null || "".equals(streetId)) {
			criteria.andStreetidEqualTo(Integer.parseInt(streetId));
			lists = villageService.selectByExample(villageExample);
			return PropertyMsg.ok(lists);
		}
		if(countyCode != null || "".equals(countyCode)) {
			criteria.andCountyidEqualTo(Integer.parseInt(countyCode));
			lists = villageService.selectByExample(villageExample);
			return PropertyMsg.ok(lists);
		}
		if(cityCode != null || "".equals(cityCode)) {
			criteria.andCityidEqualTo(Integer.parseInt(cityCode));
			lists = villageService.selectByExample(villageExample);
			return PropertyMsg.ok(lists);
		}
		return PropertyMsg.wrong("参数异常");



	}


}
