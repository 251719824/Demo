package com.cy.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class JsonResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6610388066516241663L;
	private Integer state=1;
	private Object data;
	private String message="ok";
	public JsonResult(String message) {
		this.message=message;
	}
	public JsonResult(Object data) {
		this.data=data;
	}
	public JsonResult(Throwable e) {
		this.state=0;
		this.message=e.getMessage();
	}
}
