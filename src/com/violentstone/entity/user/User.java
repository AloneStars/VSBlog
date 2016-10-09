package com.violentstone.entity.user;

public class User {
     
	//用户Id
	private int userId;
	
	//用户名
	private String username;
	
	//登录状态
	private int statue;

	
	/*****************setter and getter***************************/
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getStatue() {
		return statue;
	}

	public void setStatue(int statue) {
		this.statue = statue;
	}

	

	/****************************toString********************/
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username
				+ ", statue=" + statue + "]";
	}
		
}
