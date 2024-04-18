package com.org.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity @Data
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String userMail;
	private long userPhno;
	private  String userIdentity;
	private String userGender;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<TaskEntity> task;
	
	
	public List<TaskEntity> getTask() {
		return task;
	}

	public void setTask(List<TaskEntity> task) {
		this.task = task;
	}

	public Integer getUserId() {
		return userId;
	}
	
	public  String getUserName() {
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
	 
	public long getUserPhno() {
		return userPhno;
	}

	public void setUserPhno(long userPhno) {
		this.userPhno = userPhno;
	}

	public  String getUserIdentity() {
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
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userMail=" + userMail + ", userPhno="
				+ userPhno + ", userIdentity=" + userIdentity + ", userGender=" + userGender + "]";
	}

	public UserEntity findById(Object userId2) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
