package com.org.formbinding;

public class UserBinding {
	
	private Integer userId;
	private String userName;
	private String userMail;
	private long userPhno;
	private String userIdentity;
	private String userGender;
	
	public long getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(long userPhno) {
		this.userPhno = userPhno;
	}
	
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	
	 
	public String getUserIdentity() {
		return userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	@Override
	public String toString() {
		return "UserBinding [userId=" + userId + ", userName=" + userName + ", userMail=" + userMail + ", userPhno="
				+ userPhno + ", userIdentity=" + userIdentity + ", userGender=" + userGender + "]";
	}
	
}
