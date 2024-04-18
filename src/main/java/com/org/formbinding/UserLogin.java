package com.org.formbinding;

public class UserLogin {
	
	private String userMail;
	private String userIdentity;
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
	@Override
	public String toString() {
		return "UserLogin [userMail=" + userMail + ", userIdentity=" + userIdentity + "]";
	}
	
	
	
	
}
