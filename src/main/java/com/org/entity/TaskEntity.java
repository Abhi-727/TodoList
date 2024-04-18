package com.org.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity @Data
public class TaskEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskId;

	private String taskName;

	private LocalDate taskDate;

	private LocalTime taskTime;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

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

	public UserEntity getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "TaskEntity [taskId=" + taskId + ", taskName=" + taskName + ", taskDate=" + taskDate + ", taskTime="
				+ taskTime + ", user=" + user + "]";
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

}
