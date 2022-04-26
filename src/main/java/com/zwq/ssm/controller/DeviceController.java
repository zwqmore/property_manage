package com.zwq.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zwq.ssm.comm.Cons;
import com.zwq.ssm.constant.PropertyMsg;
import com.zwq.ssm.mapper.DeviceMapper;
import com.zwq.ssm.pojo.*;
import com.zwq.ssm.service.DeviceService;
import com.zwq.ssm.vo.DeviceVO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/17 10:53
 */
@RestController
@RequestMapping("/device")
public class DeviceController extends BaseController{

	@Autowired
	private DeviceService deviceService;

	@Autowired
	private DeviceMapper deviceMapper;

	@RequiresPermissions(value = {":dev:add"})
	@RequestMapping(value = "/insertDevice", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public Object insertDevice(Integer villageId, String deviceName, String deviceDesc, String devicePhone,String deviceVersion, HttpServletRequest request) {
		System.out.println("deviceName"+deviceName+" villageId:"+villageId);
		if(villageId == null || deviceName == null || deviceDesc == null || devicePhone == null
				|| deviceVersion == null){
			return PropertyMsg.wrong("参数异常");
		}

		if(deviceName.length() <2 || deviceName.length() > 10) {
			return PropertyMsg.wrong("账户长度有误");
		}

		if(deviceVersion.length() <1 || deviceVersion.length() > 10) {
			return PropertyMsg.wrong("姓名长度有误");
		}

		if(devicePhone.length() != 11) {
			return PropertyMsg.wrong("手机号码有误");
		}

		if(!"".equals(deviceDesc)) {
			if(deviceDesc.length() <1 || deviceDesc.length() > 30) {
				return PropertyMsg.wrong("设备描述长度有误");
			}
		}
		Device device = new Device();
		device.setDeviceType((byte) 1);
		device.setDeviceName(deviceName);
		device.setDeviceDesc(deviceDesc);
		device.setDeviceStatus((byte) 0);
		device.setDevicePhone(devicePhone);
		device.setDeviceVersion(deviceVersion);
		device.setDeviceVillageId(villageId);
		device.setDeviceCreateTime(new Date());
		device.setDeviceUpdateTime(new Date());
		System.out.println("添加的device:"+device.toString());
		deviceMapper.insert(device);
		return PropertyMsg.ok();
	}

	@RequiresPermissions(value = {":dev:list"})
	@RequestMapping("/getAll")
	public PropertyMsg listDeviceAll(HttpServletRequest request, @RequestParam Integer page, @RequestParam Integer limit,
									@RequestParam(required = false) String deviceName, @RequestParam(required = false) String villageName) {
		DeviceExample deviceExample = new DeviceExample();
		DeviceExample.Criteria criteria = deviceExample.createCriteria();
		System.out.println("deviceName:"+deviceName+" villageName:"+villageName);
		if(deviceName != null && !"".equals(deviceName)) {
			System.out.println("bi1");
			criteria.andDeviceNameLike("%"+deviceName+"%");
		}
		if(villageName != null && !"".equals(villageName)) {
			System.out.println("bi2");
			criteria.andVillageNameLike("%"+villageName+"%");
		}

		System.out.println("page:"+page+" li:"+limit);

		if( getSessionUser(request).getRoleid() != Cons.USER_ADMIN) {
			int villageId = getSessionUser(request).getVillageid();
			criteria.andDeviceVillageIdEqualTo(villageId);
		}


		PageHelper.startPage(page,limit);
		List<DeviceVO> deviceVOList = deviceService.selectVOByExampleWithPage(deviceExample);
		PageInfo<DeviceVO> info = new PageInfo<>(deviceVOList);

		System.out.println("list大小："+deviceVOList.size());
		System.out.println(info.toString());

		return new PropertyMsg(0, (int) info.getTotal(),deviceVOList,"成功");
	}

	@RequiresPermissions(value = {":dev:update"})
	@RequestMapping(value = "/updateDevice", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public Object updateDevice(Integer id, String deviceName, String deviceDesc, String devicePhone, String deviceVersion, HttpServletRequest request) {
		System.out.println("id"+id+"deviceName:"+deviceName+" deviceDesc:"+deviceDesc+" devicePhone"+devicePhone+" deviceVersion:"+deviceVersion);
		if(id == null || deviceName == null || devicePhone == null || deviceVersion == null) {
			return PropertyMsg.wrong("参数异常");
		}
		if(deviceMapper.selectByPrimaryKey(id) == null) {
			return PropertyMsg.wrong("设备不存在");
		}
		if(deviceName.length() < 2 || deviceName.length() > 10) {
			return PropertyMsg.wrong("设备名称为2-10位");
		}

		Device device = deviceMapper.selectByPrimaryKey(id);
		device.setDeviceName(deviceName);
		device.setDeviceDesc(deviceDesc);
		device.setDevicePhone(devicePhone);
		device.setDeviceVersion(deviceVersion);
		device.setDeviceUpdateTime(new Date());
		deviceService.updateByPrimaryKey(device);

		return PropertyMsg.ok();
	}

	@RequiresPermissions(value = {":dev:del"})
	@RequestMapping(value = "/deleteDevice", method = RequestMethod.POST, produces = "application/json; charset=UTF-8;")
	@ResponseBody
	public Object deleteDevice(Integer id, HttpServletRequest request) {
		System.out.println("id"+id);
		if(id == null){
			return PropertyMsg.wrong("参数异常");
		}
		if(deviceMapper.selectByPrimaryKey(id) == null) {
			return PropertyMsg.wrong("设备不存在");
		}
		deviceMapper.deleteByPrimaryKey(id);
		return PropertyMsg.ok();
	}

}
