package com.cy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cy.entity.JsonResult;
import com.cy.entity.PageObject;
import com.cy.entity.Users;
import com.cy.service.QueryUsers;

@Controller
@RequestMapping("/user/")
public class UsersController {
	
	@Autowired
	private QueryUsers userService;
	
	
	//@RequestMapping("users_list")
	public  List<Users> findObject( Model model){
		
		 List<Users> usersList = userService.findAll();
		 String findAlla = userService.findAlla();
		// Model addAttribute = model.addAttribute("usersList", usersList);
		 for (Users users : usersList) {
			
		}
		return usersList;
	}
	
	
	 @RequestMapping("doPageUI")
     public String doPageUI() {
     	return "common/page";
     }
	
	
	@RequestMapping("/user_list")
	public String usersList() {
		
		return "user_list";
	}
	//@RequestMapping
	//public String 
	
	
	@RequestMapping("/user/findAll")
	@ResponseBody
	public JsonResult finPageObject(Long uid, Long pageNo,Model model){
		
		PageObject<Users> findPageObject = userService.findPageObject(uid, pageNo) ;
		 Model addAttribute = model.addAttribute("userList", findPageObject);
		 System.out.println(addAttribute);
		
		 return new JsonResult(userService.findPageObject(uid, pageNo));
		//System.out.println("nihao");
	}
}
