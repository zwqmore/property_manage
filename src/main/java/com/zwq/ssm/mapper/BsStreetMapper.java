package com.zwq.ssm.mapper;

import com.zwq.ssm.pojo.BsStreet;
import com.zwq.ssm.pojo.BsStreetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BsStreetMapper {
    int countByExample(BsStreetExample example);

    int deleteByExample(BsStreetExample example);

    int deleteByPrimaryKey(Integer streetId);

    int insert(BsStreet record);

    int insertSelective(BsStreet record);

    List<BsStreet> selectByExample(BsStreetExample example);

    BsStreet selectByPrimaryKey(Integer streetId);

    int updateByExampleSelective(@Param("record") BsStreet record, @Param("example") BsStreetExample example);

    int updateByExample(@Param("record") BsStreet record, @Param("example") BsStreetExample example);

    int updateByPrimaryKeySelective(BsStreet record);

    int updateByPrimaryKey(BsStreet record);
}