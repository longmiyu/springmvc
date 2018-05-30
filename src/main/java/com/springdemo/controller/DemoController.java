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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springdemo.entity.users;
import com.springdemo.service.DemoService;

import net.sf.json.JSONArray;

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
        return "index";
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
    /**
     * 用户添加
     * @param Mp
     * @return
     */
    
    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser( Map<String,Object> Mp) {
    	System.out.println(Mp);
    	
		return null;
    	
    }
    /**
     * 弹出框
     * @param url
     * @return
     */
    @RequestMapping("/openDilog")
    public String openDilog(String url) {
		return url;

	}
    /**
     * 保存数据
     * @param mp
     * @return
     */
    
    @RequestMapping("/saveUpUser")
    @ResponseBody
    public Map<String,Object>  saveUpUser(@RequestBody(required=true) Map<String,Object> mp) {
    	System.out.println(mp);
		return ds.saveUpUser(mp);
    	
    }
    
    @RequestMapping("/queryUpUser")
    @ResponseBody
    public List<Map<String,Object>> queryUpUser(){
    	List<Map<String,Object>>aa = ds.queryUpUser();
    	JSONArray jsonStr = JSONArray.fromObject(aa); 
    	
    	System.out.println(aa);
		return aa;
    	
    }
   @RequestMapping("/userLogin")
    public String userLogin(@RequestBody(required=true) Map<String,Object> mp) {
	   
	   Map<String,Object> map =ds.userLogin(mp);
		return null;
    	
    }
}