package com.springdemo.dao.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.dao.DemoDao;
import com.springdemo.entity.sysEmpType;
import com.springdemo.entity.users;
import com.springdemo.model.UpUser;
import com.springdemo.utils.HibernateBaseDao;

@Repository
public class DemoDaoImpl extends HibernateBaseDao implements DemoDao{
    
	@Override
	@Transactional(readOnly = false)
	public Map<String, Object> queryUser(String name) {
		Map<String,Object> mp = new HashMap<String,Object>();
		StringBuffer sql = new StringBuffer();
/*		List<sysEmpType> us = (List<sysEmpType>) this.getHibernateTemplate().find("from sysEmpType");
		sql.append(" select * from sysEmpType ");*/
/*		List<Object> re =this.queryListBySql(sql.toString());*/
/*		sql.append("select *from users ");
		List<Object> re =this.queryListBySql(sql.toString()); 
		List<Map<String,Object>> aa = this.queryListMapBySql(sql.toString());*/
		StringBuffer insertSql  = new StringBuffer();
		insertSql.append(" insert into up_user (uer_code,user_name,user_age,user_password)values('004','李四1','27','12345678')");
		//this.updateSql(insertSql.toString());
		
		UpUser up = new UpUser();
		up.setUerCode("01");
		up.setUserName("张三");
		up.setUserAge(23);
		up.setUserPassword("123456");
		/*getHibernateTemplate().save(up);*/
/*		
		 getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
	        this.getHibernateTemplate().save(up);  
		*/
//		List<UpUser> us = (List<UpUser>) this.getHibernateTemplate().find("from UpUser");
//		System.out.println(us);
		
		Object ob = new Object();
		System.out.println(ob);
		System.out.println("dao");
	  	mp.put("name", "bb");
    	mp.put("password", "aa");  
		return mp;
	}

	@Override
	public List<Map<String, Object>> query() {
		System.out.println("查询");
		StringBuffer sql = new StringBuffer();
		sql.append("select * from up_user ");
		
		return this.queryListMapBySql(sql.toString());
	}
	
}
