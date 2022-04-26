package com.zwq.ssm.service;

import com.zwq.ssm.pojo.Village;
import com.zwq.ssm.pojo.VillageExample;

import java.util.List;

public interface VillageService {

	List<Village> selectByExample(VillageExample villageExample);

	List<Village> selectByExampleWithPage(VillageExample villageExample);

	void updateVillageByPrimaryKey(Village village);

	int deleteVillageByPrimaryKey(int id);

	boolean isExistVillageById(int id);

	Village selectByPrimaryKey(int id);

	int updateByPrimaryKey(Village village);

	void insertVillage(Village village);


}
