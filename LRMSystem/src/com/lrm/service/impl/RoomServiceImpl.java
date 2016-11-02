package com.lrm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.Room;
import com.lrm.service.RoomService;


@Service
@Transactional
public class RoomServiceImpl extends BaseDaoImpl<Room> implements RoomService{

	@Override
	public List<Room> getRoomList() {
		// TODO Auto-generated method stub
		return findAll();
	}

	@Override
	public void roomAdd(Room room) {
		// TODO Auto-generated method stub
		save(room);
	}

	@Override
	public void roomDeleteById(long roomId) {
		// TODO Auto-generated method stub
		delete(roomId);
	}





}
