package com.springdemo.service;

import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface DemoService {
	public Map<String,Object> queryUser(String name);

	public List<Map<String, Object>> query();

}
