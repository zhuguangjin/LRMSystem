package com.lrm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.lrm.dao.StudentsDao;
import com.lrm.entity.Student;

/**
 * @brief 学生Dao接口实现类
 * @author zhuguangjin
 *
 */
@Repository
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentsDao{


	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getByNumber(String studentNumber) {
		// TODO Auto-generated method stub
		List<Student> studentList;
		Session session = getSession();
		Query query = session.createQuery("FROM Student stu WHERE stu.studentNumber=?");
		query.setParameter(0, studentNumber);//
		studentList = (List<Student>) query.list();
		return studentList;
	}

	@Override
	public void printstr() {
		// TODO Auto-generated method stub
		System.out.println("你出来呀");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getByClassName(String className) {
		// TODO Auto-generated method stub
		List<Student> studentList;
		Session session = getSession();
		Query query = session.createQuery("FROM Student stu WHERE stu.schoolClass.soclassName=?");
		query.setParameter(0, className);//
		studentList = (List<Student>) query.list();
		return studentList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getByMajor(String studentMajor) {
		// TODO Auto-generated method stub
		List<Student> studentList;
		Session session = getSession();
		Query query = session.createQuery("FROM Student stu WHERE stu.schoolClass.soclassMajor=?");
		query.setParameter(0, studentMajor);//
		studentList = (List<Student>) query.list();
		// Iterator<Student> itr = studentList.iterator();
		// while (itr.hasNext()) {
		// Student str = itr.next();
		// System.out.println(str.getSchoolClass().getAcademy());
		// System.out.println(str.getSchoolClass().getSoclassName());
		// System.out.println(str.getSchoolClass().getSoclassMajor());
		// System.out.println(str.getSchoolClass().getSoclassGrade());
		// }
		return studentList;
	}
	
	

}
