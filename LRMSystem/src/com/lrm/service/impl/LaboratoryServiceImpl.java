package com.lrm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.Laboratory;
import com.lrm.service.LaboratoryService;

@Service
@Transactional
public class LaboratoryServiceImpl extends BaseDaoImpl<Laboratory> implements LaboratoryService{

	@Override
	public List<Laboratory> getLaboratoryList() {
		// TODO Auto-generated method stub
		List<Laboratory> laboratoryList = null;
		laboratoryList = findAll();
		return laboratoryList;
	}

	@Override
	public void laboratoryAdd(Laboratory laboratory) {
		// TODO Auto-generated method stub
		save(laboratory);
	}

	@Override
	public void laboratoryDeleteById(long labId) {
		// TODO Auto-generated method stub
		delete(labId);
	}

}
