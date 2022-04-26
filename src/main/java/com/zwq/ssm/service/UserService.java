package com.zwq.ssm.service;

import com.zwq.ssm.pojo.User;
import com.zwq.ssm.pojo.UserExample;
import com.zwq.ssm.vo.UserVO;

import java.util.List;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/2 9:58
 */
public interface UserService {
	/**
	 * 从数据库中查询出所有的User对象
	 * @return User对象集合
	 */
	List<User> selectAll();

	User selectByUsername(String username);

	List<UserVO> selectVOByExample(UserExample userExample);

	List<UserVO> selectVOByExampleWithPage(UserExample userExample);

	boolean isExistUserById(int id);

	boolean validUsername(String username);

	boolean validPhone(String phone);

	User selectByPrimaryKey(int id);

	void updateUserByPrimaryKey(User user);

	int deleteUserByPrimaryKey(int id);

	void insert(User user);



}
