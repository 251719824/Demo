package com.cy.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PageObject<T> implements Serializable{
	private static final long serialVersionUID = 7659540438177454440L;
	/**封装查询到的当前页记录*/
	private List<T>records;
	
	/**总记录数*/
	private Long Count;
	/**总页数*/
	private Long pageCount;
	/**页面大小*/
	private Integer pageSize;
	/**当前页码*/
	private Long pageNo;
	public PageObject(List<T> records, Long Count, Integer pageSize, Long pageNo) {
		super();
		this.records = records;
		this.Count = Count;
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		/**计算总数*/
		this.pageCount= ((Count-1)/pageSize + 1);
	}
	
}
