package com.springdemo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public interface DemoDao {
	public Map<String, Object> queryUser(String name) ;

	public List<Map<String, Object>> query();

	public Map<String, Object> saveUpUser(Map<String, Object> mp);

	public List<Map<String, Object>> queryUpUser();

	public Map<String, Object> userLogin(Map<String, Object> mp);

}
