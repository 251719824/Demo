package com.cy.java.jdk8.time;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cy.entity.Users;
import com.cy.mapper.UsersMapper;

@SpringBootTest
public class Test {
	@Autowired
	private UsersMapper usersMapper;
	
	@org.junit.jupiter.api.Test
	public void testsUsers() {
		IPage<Users> userPage = new Page<>(2, 5);
		userPage=usersMapper.selectPage(userPage, null);
		List<Users> list = userPage.getRecords();
		for (Users users : list) {
			
			System.out.println(users);
	}
	
	}
	}
