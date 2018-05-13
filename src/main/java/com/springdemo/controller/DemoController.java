package com.springdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springdemo.entity.user;

@Controller
@RequestMapping("/demo")
public class DemoController {

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
    public Map<String,Object> login1 (user u) {
    	System.out.println("name:"+u.getName());
    	System.out.println("password:"+u.getPassword());
    	Map<String,Object> mp = new HashMap<String,Object>();
    	mp.put("name", u.getName());
    	mp.put("password", u.getPassword());
    	
		return mp;
    	
    };
}