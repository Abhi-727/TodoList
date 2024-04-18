package com.org.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.entity.TaskEntity;
import com.org.entity.UserEntity;
import com.org.formbinding.TaskBinding;
import com.org.service.ITaskService;
import com.org.service.IUserReg;

@Controller
public class TaskController {

	@Autowired
	private ITaskService service;

	private Integer userId;

	@GetMapping("/createtask")
	public String taskPage(@RequestParam Integer userId, Model model) {

		this.userId = userId;

		TaskBinding taskbinding = new TaskBinding();
		model.addAttribute("TaskBinding", taskbinding);

		// model.addAttribute("task", new TaskBinding());

		return "createtask";
	}

	@PostMapping("/createtask")
	public String handleTaskPage(@ModelAttribute("TaskBinding") TaskBinding taskbinding, Model model) {		
		
		
		TaskEntity taskdetails=service.createTask(taskbinding, userId);
		
		System.out.println(taskdetails);
		
		
		 // UserEntity task = taskbinding.getUserId();
		  
		 // System.out.println(task);
		 
		

		model.addAttribute("task", "Task created");

		return "createtask";
	}
	
	
	  @GetMapping("/viewtask") 
	  public String displayTask() {
	  
	  
	  return "viewtask"; }
	 

}

/*
 * java.lang.IllegalStateException: Neither BindingResult nor plain target
 * object for bean name 'TaskBinding' available as request attribute
 */ // ----1//

//exception --date and time

/*
 * org.springframework.beans.factory.UnsatisfiedDependencyException: Error
 * creating bean with name 'taskController': Unsatisfied dependency expressed
 * through field 'service': Error creating bean with name 'taskSerImpl':
 * Unsatisfied dependency expressed through field 'taskrepo': Error creating
 * bean with name 'taskEntityRepo' defined in com.org.repo.TaskEntityRepo
 * defined in @EnableJpaRepositories declared on
 * JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Could not create
 * query for public abstract com.org. entity.UserEntity
 * com.org.repo.TaskEntityRepo.findByUserId(java.lang.Integer); Reason: Failed
 * to create query for method public abstract com.org.entity.UserEntity
 * com.org.repo.TaskEntityRepo.findByUserId(java.lang.I nteger); No property
 * 'id' found for type 'UserEntity'; Traversed path: TaskEntity.user
 */
