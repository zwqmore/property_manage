package com.zwq.ssm.service.impl;

import com.zwq.ssm.mapper.DeviceMapper;
import com.zwq.ssm.pojo.Device;
import com.zwq.ssm.pojo.DeviceExample;
import com.zwq.ssm.service.DeviceService;
import com.zwq.ssm.vo.DeviceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * description: 设备
 *
 * @author zwq
 * @date 2021/12/17 10:47
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private DeviceMapper deviceMapper;

	@Override
	public List<Device> selectAll() {
		DeviceExample deviceExample = new DeviceExample();
		return deviceMapper.selectByExample(deviceExample);
	}

	@Override
	public List<Device> selectByExampleWithPage(DeviceExample deviceExample) {
		return deviceMapper.selectByExampleWithPage(deviceExample);
	}

	@Override
	public List<DeviceVO> selectVOByExampleWithPage(DeviceExample deviceExample) {
		return deviceMapper.selectVOByExampleWithPage(deviceExample);
	}

	@Override
	public int updateByPrimaryKey(Device device) {
		return deviceMapper.updateByPrimaryKey(device);
	}
}
