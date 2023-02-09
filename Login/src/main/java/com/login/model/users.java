package com.login.model;

public class users {
	
	String user;
	String password;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public users(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	public users() {
		super();
	}
	@Override
	public String toString() {
		return "users [user=" + user + ", password=" + password + "]";
	}

}
