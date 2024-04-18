package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.org.entity.UserEntity;
import com.org.formbinding.UserBinding;
import com.org.formbinding.UserLogin;
import com.org.repo.UserEntityRepo;
import com.org.service.IUserReg;

@Controller
public class UserController {

	@Autowired
	private IUserReg service;

	@GetMapping("/")
	public String homePage() {

		return "index";
	}

	@GetMapping("/signup")
	public String signupPage(Model model) {
		UserBinding userbinding = new UserBinding();

		model.addAttribute("UserBinding", userbinding);
		return "signup";
	}

	@PostMapping("/register")
	public String handleSinupPage(@ModelAttribute("UserBinding") UserBinding ubind, Model model) {

		String result = service.registeruser(ubind);

		if ("Registered successfully".equals(result)) {
//			model.addAttribute("reg", "Details are saved");
		} else {
			model.addAttribute("reg", "User Already Exists");
			return "signup";
		}

		return "index";
	}

	@GetMapping("/login")
	public String loginPage(Model model) {

		UserLogin user = new UserLogin();
		model.addAttribute("UserLogin", user);
		return "login";
	}

	@PostMapping("/login")
	public String submitLoginPage(@ModelAttribute("UserLogin") UserLogin ulogin, Model model) {

		System.out.println(ulogin);

		UserEntity userlogin = service.loginUser(ulogin.getUserMail(), ulogin.getUserIdentity());

		System.out.println(userlogin);

		if (userlogin != null) {

//			session.setAttribute("userId", userlogin.getUserId());
			return "redirect:/createtask?userId=" + userlogin.getUserId();
		} else {
			model.addAttribute("errMsg", "Entered wrong credentials !");
			return "login";
		}
	}

}

/*
 * java.lang.IllegalStateException: Neither BindingResult nor plain target
 * object for bean name 'UserBinding' available as request attribute
 */

//java.lang.IllegalStateException: Neither BindingResult nor plain
//target object for bean name 'UserLogin' available as request attribute--added @ModelAttribute("UserLogin")

//org.hibernate.query.QueryTypeMismatchException: Specified result type [java.lang.String]
//did not match Query selection type [com.org.entity.UserEntity] - multiple selections: use Tuple or array

//boolean details=service.loginUser(ulogin.getUserMail(),ulogin.getUserIdentity());

//System.out.println(details);

/*
 * if(userlogin==null) { return "login"; } else { return "createtask"; }
 */