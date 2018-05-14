package com.springdemo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface DemoService {
	public Map<String,Object> queryUser(String name);

}
