package com.zwq.ssm.mapper;

import com.zwq.ssm.pojo.Device;
import com.zwq.ssm.pojo.DeviceExample;
import com.zwq.ssm.pojo.UserExample;
import com.zwq.ssm.vo.DeviceVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper {
    int countByExample(DeviceExample example);

    int deleteByExample(DeviceExample example);

    int deleteByPrimaryKey(Integer deviceId);

    int insert(Device record);

    int insertSelective(Device record);

    List<Device> selectByExample(DeviceExample example);

    List<Device> selectByExampleWithPage(@Param("example") DeviceExample deviceExample);

    List<DeviceVO> selectVOByExampleWithPage(@Param("example") DeviceExample deviceExample);

    Device selectByPrimaryKey(Integer deviceId);

    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);
}