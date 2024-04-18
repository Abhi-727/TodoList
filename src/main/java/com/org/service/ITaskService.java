package com.org.service;

import com.org.entity.TaskEntity;
import com.org.entity.UserEntity;
import com.org.formbinding.TaskBinding;

public interface ITaskService {
	
//	public TaskEntity saveUser(TaskEntity user);
	
	public TaskEntity createTask(TaskBinding taskbinding, Integer userId);
}
