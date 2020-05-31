package com.cy.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dake implements Serializable{
	private static final long serialVersionUID = 4075833673882153806L;
	
	private Integer id;
	private Integer uid;
	private Date dakaAt;

}
