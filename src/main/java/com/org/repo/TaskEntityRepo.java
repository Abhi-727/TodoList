package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.TaskEntity;

public interface TaskEntityRepo extends JpaRepository<TaskEntity, Integer> {		
	

}
