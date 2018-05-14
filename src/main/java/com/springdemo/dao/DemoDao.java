package com.springdemo.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public interface DemoDao {
	public Map<String, Object> queryUser(String name) ;

}
