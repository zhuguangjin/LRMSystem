package com.lrm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.LabTimeTableDao;
import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.LaboratoryTimeTable;
import com.lrm.service.LabTimeTableService;


@Service
@Transactional
public class LabTimeTableServiceImpl extends BaseDaoImpl<LaboratoryTimeTable> implements LabTimeTableService{

	@Resource
	LabTimeTableDao labTimeTableDao;
	
	@Override
	public List<LaboratoryTimeTable> getLabTimeTableList(String unhandle) {
		// TODO Auto-generated method stub
		List<LaboratoryTimeTable> labtbList = labTimeTableDao.getAllByStatus(unhandle);
		return labtbList;
	}

	@Override
	public void confirmUnhanleLab(long labTimeTableId, String handle) {
		// TODO Auto-generated method stub
		LaboratoryTimeTable labt = getById(labTimeTableId);
		labt.setLabStatus(handle);
		update(labt);
	}

	@Override
	public void LabTimeTableDeleteById(long labTimeTableId) {
		// TODO Auto-generated method stub
		delete(labTimeTableId);
	}



}
