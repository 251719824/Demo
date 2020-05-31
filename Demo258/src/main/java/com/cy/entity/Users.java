package com.cy.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable{
	private static final long serialVersionUID = 8104067458349042534L;
	
	private Integer uid;
	private String nickName;
	//private String depa;
	//private String sex;
	//private Integer age;
	

}
