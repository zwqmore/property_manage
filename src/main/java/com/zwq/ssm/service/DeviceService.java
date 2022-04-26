package com.zwq.ssm.service;

import com.zwq.ssm.pojo.Device;
import com.zwq.ssm.pojo.DeviceExample;
import com.zwq.ssm.vo.DeviceVO;

import java.util.List;

/**
 * description: 设备
 * @author zwq
 * @date 2021/12/17 10:45
 */
public interface DeviceService {

	List<Device> selectAll();

	List<Device> selectByExampleWithPage(DeviceExample deviceExample);

	List<DeviceVO> selectVOByExampleWithPage(DeviceExample deviceExample);

	int updateByPrimaryKey(Device device);

}
