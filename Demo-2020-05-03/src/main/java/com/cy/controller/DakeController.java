package com.cy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cy.service.DakeService;

@Controller
@RequestMapping("/")
public class DakeController {
	
	@Autowired
	private DakeService dakeService;
	
	public String findAt() {
		
		return "";
		
	}

}
