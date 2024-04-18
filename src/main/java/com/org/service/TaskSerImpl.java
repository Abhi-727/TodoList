package com.org.service;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.patterns.IScope;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entity.TaskEntity;
import com.org.entity.UserEntity;
import com.org.formbinding.TaskBinding;
import com.org.repo.TaskEntityRepo;
import com.org.repo.UserEntityRepo;

import jakarta.transaction.UserTransaction;

@Service
public class TaskSerImpl implements ITaskService {

	@Autowired
	private TaskEntityRepo taskrepo;

	@Autowired
	private UserEntityRepo userrepo;

	/*
	 * @Override public TaskEntity saveUser(TaskEntity user) { TaskEntity
	 * savetask=taskrepo.save(user); return savetask; }
	 */

	@Override
	public TaskEntity createTask(TaskBinding task, Integer userId) {
		
		TaskEntity taskentity = new TaskEntity();

		BeanUtils.copyProperties(task, taskentity);

		TaskEntity taskinfo = taskrepo.save(taskentity);

		UserEntity user = userrepo.findByUserId(userId);
		
		System.out.println(userId);
		System.out.println("user = "+user);
		System.out.println();
		System.out.println();
		System.out.println(taskinfo);

		if (user != null) { 
			
			taskinfo.setUser(user);
			
			taskrepo.save(taskinfo);
			
			/*
			 * user.setTask(List.of(taskinfo)); userrepo.save(user);
			 * 
			 * System.out.println("User and Task Details After Saving : "+user);
			 */
			
		}

		

		return taskinfo;

	}

}
