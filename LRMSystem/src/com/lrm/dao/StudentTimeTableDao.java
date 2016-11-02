package com.lrm.dao;



import com.lrm.entity.StudentTimeTable;

public interface StudentTimeTableDao extends BaseDao<StudentTimeTable>{

	StudentTimeTable getStuTimeTableByCTime(String revCourseTime, String revClassName, String revWeek);



}
