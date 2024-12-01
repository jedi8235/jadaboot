package com.project.jada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jada.dao.TestDAO;
import com.project.jada.dto.TestDto;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestDAO testDao;

	@Override
	public void getBoardList() throws Exception {
		
		TestDto td = testDao.selectBoard().get(0);
		
//		System.out.println(td.toString());
		
		System.out.println(td.getId());
		System.out.println(td.getCommunityName());
		System.out.println(td.getTitle());
		System.out.println(td.getTitle_link());
		
		
		System.out.println("hello");
		
	}

}
