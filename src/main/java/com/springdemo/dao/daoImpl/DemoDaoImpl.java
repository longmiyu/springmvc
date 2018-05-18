package com.springdemo.dao.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.springdemo.dao.DemoDao;
import com.springdemo.entity.sysEmpType;
import com.springdemo.entity.users;
import com.springdemo.utils.HibernateBaseDao;

@Repository
public class DemoDaoImpl extends HibernateBaseDao implements DemoDao{
    
	@Override
	public Map<String, Object> queryUser(String name) {
		Map<String,Object> mp = new HashMap<String,Object>();
		StringBuffer sql = new StringBuffer();
/*		List<sysEmpType> us = (List<sysEmpType>) this.getHibernateTemplate().find("from sysEmpType");
		sql.append(" select * from sysEmpType ");*/
/*		List<Object> re =this.queryListBySql(sql.toString());*/
		sql.append("select *from users ");
		List<Object> re =this.queryListBySql(sql.toString());
		List<Map<String,Object>> aa = this.queryListMapBySql(sql.toString());
		 
		System.out.println(re);
		Object ob = new Object();
		System.out.println(ob);
		System.out.println("dao");
	  	mp.put("name", "bb");
    	mp.put("password", "aa");  
		return mp;
	}
	
}
