package com.lrm.dao;

import com.lrm.entity.Teacher;


public interface TeacherDao extends BaseDao<Teacher>{

	Teacher getTeacherByNameAndPassword(String teaUsername, String teaPassword);

}
