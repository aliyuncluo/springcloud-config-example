package com.cluo.config.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cluo.config.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService{
    @Autowired
	TestMapper testMapper;
	@Override
	public List<Map<String, Object>> findAll() {
		// TODO Auto-generated method stub
		return testMapper.findAll();
	}

}
