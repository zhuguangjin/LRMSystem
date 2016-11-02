package com.lrm.dao;

import java.util.List;

import com.lrm.entity.StudentScore;

public interface StudentScoreDao extends BaseDao<StudentScore>{

	List<StudentScore> getStuScoreByClassName(String soclassName);

	List<StudentScore> getStuScoreByStuNumber(String stuNumber);

	List<StudentScore> getStuScoreByTeacherName(String teacherUsername);

	
}
