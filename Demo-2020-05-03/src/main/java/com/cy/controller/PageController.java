package com.cy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/")
@Controller
public class PageController {
	
        
        @RequestMapping("doPageUI")
        public String doPageUI() {
        	return "page";
        }

	/*
	 * @RequestMapping("log/log_list") public String doLogUI() { return
	 * "sys/log_list"; }
	 * 
	 * @RequestMapping("/menu/menu_list") public String doMenuUI() {
	 * return"sys/menu_list"; }
	 */
        /**
         * REST风格的url映射:REST是一种软件架构编码风格,在这种风格下的url定义
         * ,可以使用{变量}的方式让url更简单通用.在方法参数中需要url中的
         * {变量}值时,需要用@PathVariable注解对方法参数进行描述,并且要求方法
         * 参数的名字要与{变量}表达式中的变量名相同
         * @param module
         * @param moduleUI
         * @return
         */
        @RequestMapping("/{module}/{moduleUI}")
        public String doModuleUI(@PathVariable String module,@PathVariable String moduleUI) {
        	
        	return "sys/"+moduleUI;
        }
       
}