package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.Laboratory;

public interface LaboratoryService extends BaseDao<Laboratory>{

	List<Laboratory> getLaboratoryList();

	void laboratoryAdd(Laboratory laboratory);

	void laboratoryDeleteById(long labId);

}
