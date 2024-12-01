package com.project.jada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jada.service.TestService;

@RestController
public class TestController{
	
	@Autowired
	TestService tservice;
	
	@RequestMapping("/hello")
	public String hello() {
		try {
			tservice.getBoardList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "hello world!!!";
	}
}
