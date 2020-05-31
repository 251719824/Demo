package com.cy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.cy.entity.PageObject;
import com.cy.entity.Users;
import com.cy.mapper.UsersMapper;


@Service
public class QueryUsersImpl implements QueryUsers {
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public List<Users> findAll() {
		List<Users> findAll = usersMapper.findAll();
		if (findAll != null) {
			for (Users users : findAll) {
				Integer uid = users.getUid();
				String nickName = users.getNickName();
				System.out.println(uid+":"+nickName);
				
				
			}
		}
		return usersMapper.findAll();
		
	}

	@Override
	public String findAlla() {
		List<Users> findAll = usersMapper.findAll();
		if (findAll != null) {
			for (Users users : findAll) {
				Integer uid = users.getUid();
				String nickName = users.getNickName();
				System.out.println(uid+":"+nickName);
				return nickName;
				
			}
		}
		return "不知名查询";
	}

	@Override
	@Transactional
	public PageObject<Users> findPageObject(Long uid, Long pageNo) {
			//if (pageNo == null || pageNo<1) 
				//throw new IllegalArgumentException("页码值不正确");
			pageNo =  2L;
			long Count = usersMapper.getRowCount(uid);
			System.out.println(Count);
				int pageSize = 5;
				long startIndex =(pageNo-1)*pageSize;
				List<Users> records = usersMapper.findAll(uid, startIndex, pageSize);
				
				return new PageObject<>(records, Count,  pageSize, pageNo);
				
			
		
	}

	
	

	
}
