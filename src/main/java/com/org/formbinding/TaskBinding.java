package com.org.formbinding;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.org.entity.UserEntity;

public class TaskBinding {

	private String taskName;
	
	private LocalDate taskDate;
	
	private LocalTime taskTime;
	
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public LocalDate getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}
	public LocalTime getTaskTime() {
		return taskTime;
	}
	public void setTaskTime(LocalTime taskTime) {
		this.taskTime = taskTime;
	}
	
	
	@Override
	public String toString() {
		return "TaskBinding [taskName=" + taskName + ", taskDate=" + taskDate + ", taskTime=" + taskTime + "]";
	}
	public UserEntity getUserId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
