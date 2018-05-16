package com.springdemo.utils;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public abstract class HibernateBaseDao extends HibernateDaoSupport{
	@Resource(name="sessionFactory")
	public void setSessionFacotry(SessionFactory sessionFacotry) {
	         super.setSessionFactory(sessionFacotry); 
	} 

}
