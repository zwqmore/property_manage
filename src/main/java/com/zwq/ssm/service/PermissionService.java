package com.zwq.ssm.service;

import com.zwq.ssm.pojo.Permission;

import java.util.List;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/7 10:57
 */
public interface PermissionService {

	List<Permission> selectListsByRoleid(int roleId);

	List<Permission> selectListsAll();

}
