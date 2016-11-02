package com.lrm.dao;

import java.util.List;

import com.lrm.entity.TeacherTimeTable;

public interface TeacherTimeTableDao extends BaseDao<TeacherTimeTable>{
	
	/**
	 * @brief 按照课程的时间，查询出老师课程表，保存在一个链表中
	 * @param courseTime
	 * @return
	 */
	List<TeacherTimeTable> teaTimeTableByCourseTime(String courseTime, long teaId);

	List<TeacherTimeTable> getTeaTimeTableByTid(long teacherId);

	TeacherTimeTable getTeaTimeTableByCTime(String revClassName, String revCourseTime, String revWeek);
	
	
}
