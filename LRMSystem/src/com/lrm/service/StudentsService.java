package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.Student;

public interface StudentsService extends BaseDao<Student>{

	List<Student> studentFindAll();

	List<Student> getStudentByNumber(String studentNumber);

	List<Student> getStudentByClassName(String className);

	List<Student> getStudentByMajor(String studentMajor);

	void studentDeleteById(long studentId);

	void studentAdd(Student student, long clId);








    
}
