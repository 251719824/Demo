package com.cy.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

import com.cy.entity.PageObject;
import com.cy.entity.Users;

public interface QueryUsers {

	List<Users> findAll();
	String findAlla();
	PageObject<Users> findPageObject(Long uid, Long pageNo);
	PageObject findPageObjects(Long current, Integer size);

}
