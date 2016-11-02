package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.SchoolClass;

public interface SchoolClassService extends BaseDao<SchoolClass>{

	List<SchoolClass> sclassFindAll();

	void sclassAdd(SchoolClass schooClass);

	void sclassDeleteById(long soclassId);

}
