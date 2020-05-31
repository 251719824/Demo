package com.cy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cy.entity.Users;

@Mapper
public interface UsersMapper extends BaseMapper<Users> {

	List<Users> findAll();
	List<Users> findAll(Long uid,Long startIndex,int pageSize);
	long getRowCount(Long uid);
	
	
	

	
	
}
