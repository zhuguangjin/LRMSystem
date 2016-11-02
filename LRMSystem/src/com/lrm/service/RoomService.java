package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.Room;

public interface RoomService extends BaseDao<Room>{

	List<Room> getRoomList();

	void roomAdd(Room room);

	void roomDeleteById(long roomId);



}
