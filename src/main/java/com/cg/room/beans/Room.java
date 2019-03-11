package com.cg.room.beans;

public class Room {
	private String room_type,status;

	public Room(String room_type, String status) {
		this.room_type=room_type;
		this.status=status;
	}

	public Room() {
		// TODO Auto-generated constructor stub
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
