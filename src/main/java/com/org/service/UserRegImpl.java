package com.org.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entity.UserEntity;
import com.org.formbinding.UserBinding;
import com.org.repo.UserEntityRepo;

@Service
public class UserRegImpl implements IUserReg {

	@Autowired
	private UserEntityRepo repo;

	@Override
	public String registeruser(UserBinding user) {

		String mail = user.getUserMail();
		String password = user.getUserIdentity();
		
		UserEntity userEntity = repo.findByUserMailAndUserIdentity(mail, password);
		
		if(userEntity != null)
			return "User Already Exists";
		else {
			UserEntity userdetails = new UserEntity();

			BeanUtils.copyProperties(user, userdetails);

			UserEntity u = repo.save(userdetails);
		}

		return "Registered successfully";
	}

	@Override
	public UserEntity loginUser(String name, String identity) {

		System.out.println("Name " + name + "   Password " + identity);

		UserEntity userpswd = repo.findByUserMailAndUserIdentity(name, identity);

		System.out.println(userpswd);

		if (userpswd != null) {
			return userpswd;
		} else
			return null;

	}

	/*
	 * @Override public Optional<UserEntity> storeUserId(Integer userid) {
	 * Optional<UserEntity> result=repo.findByUserId(userid); return result; }
	 */

	@Override
	public UserEntity saveUser(Integer user) {
		UserEntity userinfoEntity = repo.findByUserId(user);
		return userinfoEntity;
	}

	@Override
	public UserEntity getUserinfo(Integer userId) {
		UserEntity details = repo.findByUserId(userId);
		return details;
	}

}
