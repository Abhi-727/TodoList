package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.UserEntity;

public interface UserEntityRepo extends JpaRepository<UserEntity, Integer> {

	public UserEntity findByUserMailAndUserIdentity(String name,String identity);

	public UserEntity findByUserId(Integer userid);

}
