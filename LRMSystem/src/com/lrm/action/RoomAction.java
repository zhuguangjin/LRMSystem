package com.lrm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lrm.entity.Room;
import com.lrm.service.RoomService;
import com.opensymphony.xwork2.ModelDriven;

@Scope("prototype")
@Controller("RoomAction")
public class RoomAction extends BaseAction implements ModelDriven<Room>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource
	RoomService roomService;
	
	Room room = new Room();
	
	/**
	 * @brief 教室列表界面
	 * @return
	 */
	public String roomListUI() {
		List<Room> roomList = roomService.getRoomList();
		session.setAttribute("roomList", roomList);
		return "roomListUI";
	}
	
	/**
	 * @brief 教室添加
	 * @return
	 */
	public String roomAddUI() {
		return "roomAddUI";
	}
	
	/**
	 * @brief 教室添加
	 * @return
	 */
	public String roomAdd() {
		roomService.roomAdd(room); 
		return "toRoomListUI";
	}
	
	/**
	 * @brief 教室删除
	 * @return
	 */
	public String roomDelete() {
		roomService.roomDeleteById(room.getRoomId());
		return "toRoomListUI";
	}
	
	
	@Override
	public Room getModel() {
		// TODO Auto-generated method stub
		return room;
	}

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
