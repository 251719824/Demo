package com.cy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cy.entity.Users;

@Mapper
public interface UsersMapper {

	List<Users> findAll();
	List<Users> findAll(Long uid,Long startIndex,int pageSize);
	long getRowCount(Long uid);
	
	
	

	
	
}
