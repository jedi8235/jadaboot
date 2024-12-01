package com.project.jada.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.jada.dto.TestDto;

@Mapper
public interface TestDAO {
	
	public List<TestDto> selectBoard() throws Exception;

}
