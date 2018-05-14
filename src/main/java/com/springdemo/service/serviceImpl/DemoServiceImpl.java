package com.springdemo.service.serviceImpl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.dao.DemoDao;
import com.springdemo.service.DemoService;
@Service
public class DemoServiceImpl implements DemoService{
	@Resource
 private DemoDao dao;
	public DemoDao getDao() {
	return dao;
}
public void setDao(DemoDao dao) {
	this.dao = dao;
}
	@Override
	public Map<String, Object> queryUser(String name) {
		System.out.println("service");
		return dao.queryUser(name);
	}

}
