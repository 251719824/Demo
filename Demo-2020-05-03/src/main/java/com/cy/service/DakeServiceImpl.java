package com.cy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.mapper.DakeMapper;



@Service
public class DakeServiceImpl implements DakeService {
	
	@Autowired
	private DakeMapper dakeMapper;
	
	
}
