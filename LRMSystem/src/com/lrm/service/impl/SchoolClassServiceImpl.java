package com.lrm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.SchoolClass;
import com.lrm.service.SchoolClassService;

@Service
@Transactional
public class SchoolClassServiceImpl extends BaseDaoImpl<SchoolClass> implements SchoolClassService{

	@Override
	public List<SchoolClass> sclassFindAll() {
		// TODO Auto-generated method stub	
		List<SchoolClass> sclassList = null;
		sclassList = findAll();
		return sclassList;
	}

	@Override
	public void sclassAdd(SchoolClass schooClass) {
		// TODO Auto-generated method stub
		save(schooClass);
	}

	@Override
	public void sclassDeleteById(long soclassId) {
		// TODO Auto-generated method stub
		delete(soclassId);
	}

}
