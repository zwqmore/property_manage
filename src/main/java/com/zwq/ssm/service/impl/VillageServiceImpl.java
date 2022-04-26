package com.zwq.ssm.service.impl;

import com.zwq.ssm.mapper.VillageMapper;
import com.zwq.ssm.pojo.Village;
import com.zwq.ssm.pojo.VillageExample;
import com.zwq.ssm.service.VillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/16 10:39
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class VillageServiceImpl implements VillageService {

	@Autowired
	private VillageMapper villageMapper;


	@Override
	public List<Village> selectByExample(VillageExample villageExample) {
		return villageMapper.selectByExample(villageExample);
	}

	@Override
	public List<Village> selectByExampleWithPage(VillageExample villageExample) {
		return villageMapper.selectByExampleWithPage(villageExample);
	}

	@Override
	public void updateVillageByPrimaryKey(Village village) {
		villageMapper.updateByPrimaryKey(village);
	}

	@Override
	public int deleteVillageByPrimaryKey(int id) {
		return villageMapper.deleteByPrimaryKey(id);
	}

	@Override
	public boolean isExistVillageById(int id) {
		if(villageMapper.selectByPrimaryKey(id) == null){
			return false;
		}
		return true;
	}

	@Override
	public Village selectByPrimaryKey(int id) {
		return villageMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Village village) {
		return villageMapper.updateByPrimaryKey(village);
	}

	@Override
	public void insertVillage(Village village) {
		villageMapper.insert(village);
	}
}
