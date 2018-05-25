package com.springdemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springdemo.entity.users;
import com.springdemo.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	@Resource
	private DemoService ds;

    public DemoService getDs() {
		return ds;
	}

	public void setDs(DemoService ds) {
		this.ds = ds;
	}

	@RequestMapping("/index")
    public String index(){
        return "login";
    }
    
    @RequestMapping("/login")
    public String login (String name,String password) {
    	System.out.println(name);
    	System.out.println(password);
    	
		return "demo";
    	
    };   
    @RequestMapping("/login1")
   @ResponseBody
    public Map<String,Object> login1 (users u) {
    	System.out.println("name:"+u.getName());
    	System.out.println("password:"+u.getPassword());
    	Map<String,Object> mp = new HashMap<String,Object>();
//    	mp.put("name", u.getName());
//    	mp.put("password", u.getPassword());   
    	mp = ds.queryUser(u.getName());
		return mp;  	
    };
    
    @RequestMapping("/query")
   @ResponseBody
    public List<Map<String,Object>> query() {
    	List<Map<String,Object>>MpList = new ArrayList<Map<String,Object>>();
    	MpList = ds.query();
		return MpList;	
	}
}