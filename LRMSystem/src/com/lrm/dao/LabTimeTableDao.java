package com.lrm.dao;

import java.util.List;

import com.lrm.entity.LaboratoryTimeTable;

public interface LabTimeTableDao extends BaseDao<LaboratoryTimeTable>{

	List<LaboratoryTimeTable> getAllByStatus(String unhandle);

	LaboratoryTimeTable getLabTimeTableByCTime(String revLabName, String revWeek, String revTime);

}
