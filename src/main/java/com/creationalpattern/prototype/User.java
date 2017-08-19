package com.creationalpattern.prototype;

public abstract class User implements Cloneable {
	
	private String userName;
	private String password;
	
	abstract void login(String userName, String password);
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Object clone() {
		Object clonedUser = null;
		try {
			clonedUser = super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedUser;
	}
	
}
