package com.zwq.ssm.service.impl;

import com.zwq.ssm.mapper.PermissionMapper;
import com.zwq.ssm.mapper.RolePermissionMapper;
import com.zwq.ssm.pojo.Permission;
import com.zwq.ssm.pojo.PermissionExample;
import com.zwq.ssm.pojo.RolePermission;
import com.zwq.ssm.pojo.RolePermissionExample;
import com.zwq.ssm.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/7 10:58
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private RolePermissionMapper rolePermissionMapper;

	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public List<Permission> selectListsByRoleid(int roleId) {
		RolePermissionExample rolePermissionExample = new RolePermissionExample();
		rolePermissionExample.createCriteria().andRoleidEqualTo(roleId);
		List<RolePermission> list = rolePermissionMapper.selectByExample(rolePermissionExample);

		List<Permission> permissionList = new ArrayList<>();
		for(int i = 0;i<list.size();i++){
			System.out.println("id:"+list.get(i).getPermid());
			permissionList.add(permissionMapper.selectByPrimaryKey(list.get(i).getPermid()));
		}

		System.out.println("size:"+permissionList.size());
		for(int j = 0;j<permissionList.size();j++){
			System.out.println(permissionList.get(j).toString());
		}
		return permissionList;
	}

	@Override
	public List<Permission> selectListsAll() {
		PermissionExample permissionExample = new PermissionExample();
		return permissionMapper.selectByExample(permissionExample);
	}
}
