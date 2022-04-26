package com.zwq.ssm.service.impl;

import com.zwq.ssm.exception.AuthenticateException;
import com.zwq.ssm.pojo.User;
import com.zwq.ssm.mapper.UserMapper;
import com.zwq.ssm.pojo.UserExample;
import com.zwq.ssm.service.UserService;
import com.zwq.ssm.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * description: TODO
 * @author zwq
 * @date 2021/12/6 17:02
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectAll() {
		UserExample userExample = new UserExample();
		return userMapper.selectByExample(userExample);
	}

	@Override
	public User selectByUsername(String username) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(username);
		return userMapper.selectByExample(userExample).get(0);
	}

	@Override
	public List<UserVO> selectVOByExample(UserExample userExample) {
		return userMapper.selectVOByExample(userExample);
	}

	@Override
	public List<UserVO> selectVOByExampleWithPage(UserExample userExample) {
		return userMapper.selectVOByExampleWithPage(userExample);
	}

	public boolean isExistUserById(int id) {

		if(userMapper.selectByPrimaryKey(id) == null){
			return false;
		}
		return true;
	}

	public boolean validUsername(String username) {

		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(username);
		if(userMapper.countByExample(userExample) != 0){
			return false;
		}
		return true;
	}

	@Override
	public boolean validPhone(String phone) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andPhoneEqualTo(phone);
		if(userMapper.countByExample(userExample) != 0){
			return false;
		}
		return true;
	}

	@Override
	public User selectByPrimaryKey(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUserByPrimaryKey(User user) {
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public int deleteUserByPrimaryKey(int id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}


}
