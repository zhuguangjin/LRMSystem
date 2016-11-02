package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.LaboratoryTimeTable;

public interface LabTimeTableService extends BaseDao<LaboratoryTimeTable>{

	List<LaboratoryTimeTable> getLabTimeTableList(String unhandle);

	void confirmUnhanleLab(long labTimeTableId, String handle);

	void LabTimeTableDeleteById(long labTimeTableId);

	

}
