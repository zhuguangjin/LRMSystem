package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.StudentScore;

public interface StudentScoreService extends BaseDao<StudentScore>{

	List<StudentScore> stuScoreFindAll();

	List<StudentScore> getStuScoreByClassName(String soclassName);

	List<StudentScore> getStuScoreByStuNumber(String stuNumber);

	List<StudentScore> getStuScoreByTeacherName(String teacherUsername);

	void stuScoreDeleteById(long stuScoreId);

}
