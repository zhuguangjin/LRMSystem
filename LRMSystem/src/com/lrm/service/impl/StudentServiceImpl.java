package com.lrm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.SchoolClassDao;
import com.lrm.dao.StudentsDao;
import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.SchoolClass;
import com.lrm.entity.Student;
import com.lrm.service.StudentsService;

@Service
@Transactional
public class StudentServiceImpl extends BaseDaoImpl<Student> implements StudentsService{

	@Resource
	StudentsDao studentdao;
	
	@Resource
	SchoolClassDao schoolclasdao;
	
	@Override
	public List<Student> studentFindAll() {
		// TODO Auto-generated method stub
		List<Student> studentList=findAll();
		return studentList;
	}

	@Override
	public List<Student> getStudentByNumber(String studentNumber) {
		// TODO Auto-generated method stub
		// Student student=getStudentByNumber(studentNumber);
		//Student student=getStudentByNumber("122548");
		//System.out.println(student.getStudentUsername());
		studentdao.printstr();
		List<Student> studentList=studentdao.getByNumber(studentNumber);
		System.out.println("到底怎么了？");
		 return studentList;
	}

	@Override
	public List<Student> getStudentByClassName(String className) {
		// TODO Auto-generated method stub
		List<Student> studentList = studentdao.getByClassName(className);
		return studentList;
	}

	@Override
	public List<Student> getStudentByMajor(String studentMajor) {
		// TODO Auto-generated method stub
		List<Student> studentList = studentdao.getByMajor(studentMajor);
		return studentList;
	}
    
	@Override
	public void studentDeleteById(long studentId) {
		// TODO Auto-generated method stub
		delete(studentId);
	}

	@Override
	public void studentAdd(Student student, long clId) {
		// TODO Auto-generated method stub
		save(student);
		SchoolClass sclass=schoolclasdao.getById(clId);
		student.setSchoolClass(sclass);
	}
}
