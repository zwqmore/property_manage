package com.zwq.ssm.mapper;

import com.zwq.ssm.pojo.Village;
import com.zwq.ssm.pojo.VillageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VillageMapper {
    int countByExample(VillageExample example);

    int deleteByExample(VillageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Village record);

    int insertSelective(Village record);

    List<Village> selectByExample(VillageExample example);

    List<Village> selectByExampleWithPage(@Param("example") VillageExample example);

    Village selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Village record, @Param("example") VillageExample example);

    int updateByExample(@Param("record") Village record, @Param("example") VillageExample example);

    int updateByPrimaryKeySelective(Village record);

    int updateByPrimaryKey(Village record);
}