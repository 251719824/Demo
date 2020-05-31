package com.cy.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("dake")
public class Dake implements Serializable{
	private static final long serialVersionUID = 4075833673882153806L;
	
	@TableId(type = IdType.AUTO)
	private Integer id;
	private Integer uid;
	private Date dakaAt;

}
