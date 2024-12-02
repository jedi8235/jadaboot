package com.project.jada.service;

import org.springframework.stereotype.Service;

import com.project.jada.dao.TestDAO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service("com.project.jada.service.Test2Service")
public class Test2Service {
	
	private final TestDAO testDao;

}
