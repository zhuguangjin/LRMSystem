package com.lrm.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.lrm.dao.TeacherDao;
import com.lrm.entity.Teacher;

@Repository
public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao{

	@Override
	public Teacher getTeacherByNameAndPassword(String teaUsername, String teaPassword) {
		// TODO Auto-generated method stub
		Teacher tea = null;
		Session session = getSession();
		Query query = session.createQuery("FROM Teacher t WHERE t.teacherUsername=? AND t.teacherPassword=?");
		query.setParameter(0, teaUsername);//
		query.setParameter(1, teaPassword);//
		tea = (Teacher) query.uniqueResult();
		return tea;
	}

}
