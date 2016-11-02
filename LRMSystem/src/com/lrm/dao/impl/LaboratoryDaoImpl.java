package com.lrm.dao.impl;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.lrm.dao.LaboratoryDao;
import com.lrm.entity.Laboratory;

@Repository
public class LaboratoryDaoImpl extends BaseDaoImpl<Laboratory> implements LaboratoryDao {

	@Override
	public Laboratory getLabByName(String labName) {
		// TODO Auto-generated method stub
		Laboratory lab = null;
		Session session = getSession();
		Query query = session.createQuery("FROM Laboratory lab WHERE lab.labName=?");
		query.setParameter(0, labName);//
		lab = (Laboratory) query.uniqueResult();		
		return lab;
	}

}
