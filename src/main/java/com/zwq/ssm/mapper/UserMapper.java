package com.zwq.ssm.mapper;

import com.zwq.ssm.dt.UserDT;
import com.zwq.ssm.pojo.User;
import com.zwq.ssm.pojo.UserExample;
import com.zwq.ssm.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    List<UserVO> selectVOByExample(UserExample example);

    List<UserVO> selectVOByExampleWithPage(@Param("example") UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}