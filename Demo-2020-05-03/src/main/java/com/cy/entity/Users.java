package com.cy.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("users")
public class Users implements Serializable{
	private static final long serialVersionUID = 8104067458349042534L;
	
	@TableId
	private Integer uid;
	private String nickName;
	//private String depa;
	//private String sex;
	//private Integer age;
	

}
