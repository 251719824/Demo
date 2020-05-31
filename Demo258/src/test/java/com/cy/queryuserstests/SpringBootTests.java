package com.cy.queryuserstests;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.cy.controller.UsersController;
import com.cy.entity.Users;
import com.cy.mapper.UsersMapper;
import com.cy.service.QueryUsers;
import com.cy.service.QueryUsersImpl;

@SpringBootTest
public class SpringBootTests {
	
	@Autowired
	private QueryUsers users;
	
	@Autowired
	private UsersMapper usersMapper;
	
	@Autowired
	private UsersController userss;
	@Test
	 public  void test01(Model model) {
		 
		String findAlla = users.findAlla();
		
		
		
		 System.out.println(findAlla);
		
		 
	 }
}
