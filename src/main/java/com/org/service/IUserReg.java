package com.org.service;

import java.security.PublicKey;
import java.util.Optional;

import com.org.entity.UserEntity;
import com.org.formbinding.UserBinding;

public interface IUserReg {
	
	public String registeruser(UserBinding user);
	public UserEntity loginUser(String name,String identity);
	
	public UserEntity saveUser(Integer user);
	public UserEntity getUserinfo(Integer userId);
	
}
