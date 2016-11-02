package com.lrm.entity;

/**
 * @brief 教室实体
 * @author zhuguangjin
 *
 */
public class Room {

	private long roomId;//教室Id
	private String roomLocation;//教室位置
	
	public Room() {
		
	}

	public Room(long roomId, String roomLocation) {
		//super();
		this.roomId = roomId;
		this.roomLocation = roomLocation;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public String getRoomLocation() {
		return roomLocation;
	}

	public void setRoomLocation(String roomLocation) {
		this.roomLocation = roomLocation;
	}
	
}
