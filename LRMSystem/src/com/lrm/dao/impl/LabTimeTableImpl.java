package com.lrm.dao.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.lrm.dao.LabTimeTableDao;
import com.lrm.entity.LaboratoryTimeTable;

@Repository
public class LabTimeTableImpl extends BaseDaoImpl<LaboratoryTimeTable> implements LabTimeTableDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<LaboratoryTimeTable> getAllByStatus(String unhandle) {
		// TODO Auto-generated method stub
		List<LaboratoryTimeTable> labtbList = null;
		Session session = getSession();
		Query query = session.createQuery("FROM LaboratoryTimeTable labtimetable WHERE labtimetable.labStatus=?");
		query.setParameter(0, unhandle);//
		labtbList = (List<LaboratoryTimeTable>) query.list();
		Iterator<LaboratoryTimeTable> ite = labtbList.iterator();
		while (ite.hasNext()) {
			LaboratoryTimeTable labtable = ite.next();
			System.out.println("实验任课老师的名字" + labtable.getLabTeacher().getTeacherUsername());
		}
		return labtbList;
	}

	@Override
	public LaboratoryTimeTable getLabTimeTableByCTime(String revLabName, String revWeek, String revTime) {
		// TODO Auto-generated method stub
		LaboratoryTimeTable labTimeTable = null;
		Date begin = new Date();
		Date end = new Date();
		//Date reTime = new Date();
		
		// 日期的处理，获取当前时间的开始，和当前时间的结束
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Calendar c = Calendar.getInstance();
			
			Date new_time = df.parse(revTime);			
			c.setTime(new_time);
			
			//对数据库中时间参数赋值
			//reTime = c.getTime();
			c.set(Calendar.HOUR_OF_DAY, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);
			begin = c.getTime();
			String sbegin = df.format(begin);
			System.out.println("一天的开始：" + sbegin);

			c.setTime(new_time);
			c.add(Calendar.DAY_OF_MONTH, +1);
			c.set(Calendar.HOUR_OF_DAY, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);
			end = c.getTime();
			String send = df.format(end);
			System.out.println("一天的结束：" + send);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("(实验室查询参数)"+revLabName+revWeek+revTime);
		// 按照时间范围查询数据库中那个时间范围内的实验课表
		Session session = getSession();	
		Query query = session.createQuery("FROM LaboratoryTimeTable labTimeTable WHERE labTimeTable.labTime>? AND labTimeTable.labTime<=? AND labTimeTable.labLaboratory.labName=? AND labTimeTable.labTimeTableWeek=?");
		query.setParameter(0, begin);//
		query.setParameter(1, end);//
		query.setParameter(2, revLabName);//
		query.setParameter(3, revWeek);//
		//query.setParameter(2, reTime);//
		labTimeTable = (LaboratoryTimeTable)query.uniqueResult();
		return labTimeTable;
	}

}
