package com.cy.controller;

import java.util.List;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.PGPData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cy.entity.JsonResult;
import com.cy.entity.PageObject;
import com.cy.entity.Users;
import com.cy.mapper.UsersMapper;
import com.cy.service.QueryUsers;

@Controller

@RequestMapping("/user")
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
	
	@RequestMapping("/user_list")
	public String usersList() {
		
		return "user_list";
	}
	
	
	@RequestMapping("/find_list")
	public String doActivityListUI(Model model){
		
		
		return "find_list";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public JsonResult finPageObject(Long uid, Long pageNo,Model model){
		
		/*PageObject<Users> findPageObject = userService.findPageObject(uid, pageNo) ;
		 Model addAttribute = model.addAttribute("userList", findPageObject);
		 System.out.println(addAttribute);*/
		model.addAttribute("userList", userService.findAll());
		System.out.println(model);
		
		 return new JsonResult(model);
		//System.out.println("nihao");
	}
	
	
	@RequestMapping("/findAlls")
	@ResponseBody
	public JsonResult findAlls( Long current,Integer size,Model model) {
		
		PageObject findPageObjects = userService.findPageObjects(current, size);
		model.addAttribute("user", findPageObjects);
		System.out.println(model);
		
		return new JsonResult(model);
	}
	
	
	
	
	
	
	
	
	
}
