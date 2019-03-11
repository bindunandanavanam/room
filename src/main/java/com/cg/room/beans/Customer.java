package com.cg.room.beans;

public class Customer {
private String mobile,name,address,email,room_type;
private int room_no;
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRoom_type() {
	return room_type;
}
public void setRoom_type(String room_type) {
	this.room_type = room_type;
}
public int getRoom_no() {
	return room_no;
}
public void setRoom_no(int room_no) {
	this.room_no = room_no;
}
public Customer(String name, String mobile, String address, String email, String room_type, int room_no) {
	super();
	this.mobile = mobile;
	this.name = name;
	this.address = address;
	this.email = email;
	this.room_type = room_type;
	this.room_no = room_no;
}
public Customer() {
	// TODO Auto-generated constructor stub
}

}
