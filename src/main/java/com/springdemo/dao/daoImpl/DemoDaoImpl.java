package com.springdemo.dao.daoImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springdemo.dao.DemoDao;

@Repository
public class DemoDaoImpl implements DemoDao{

	@Override
	public Map<String, Object> queryUser(String name) {
		Map<String,Object> mp = new HashMap<String,Object>();
		System.out.println("dao");
	  	mp.put("name", "ะกร๗");
    	mp.put("password", "234");  
		return mp;
	}
	
}
