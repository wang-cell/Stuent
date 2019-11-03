package com.bean;

public class Users {
   private String uname;
   private String passw;
public Users() {
	super();
	// TODO Auto-generated constructor stub
}
public Users(String uname, String passw) {
	super();
	this.uname = uname;
	this.passw = passw;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassw() {
	return passw;
}
public void setPassw(String passw) {
	this.passw = passw;
}

}
