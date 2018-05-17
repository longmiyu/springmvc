package com.springdemo.utils;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public abstract class HibernateBaseDao extends HibernateDaoSupport{
	@Resource(name="sessionFactory")
	public void setSessionFacotry(SessionFactory sessionFacotry) {
	         super.setSessionFactory(sessionFacotry); 
	} 
	
	  //获取Session
    protected Session getSession() {
        return this.getHibernateTemplate().getSessionFactory().getCurrentSession();
    }

    
	/**
	 * 执行sql语句将其转换成List<Object> 
	 * 
	 * @param sql
	 * @param paramObj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Object> queryListBySql(String sql, Object... paramObj) {
/*		if (StringUtils.isEmpty(sql))
			return null;*/
		//Session session = this.getCurrentSession();
		//sql=translateSql(sql);
		Query query = this.getSession().createSQLQuery(sql);
		
		if (paramObj != null && paramObj.length > 0) {
			for (int i = 0; i < paramObj.length; i++) {
				query.setParameter(i, paramObj[i]);
			}
		}
		List<Object> returnMap= (List<Object>) query.setResultTransformer( Transformers.TO_LIST).list();
		return returnMap ;
		
	}
    

    @SuppressWarnings("unchecked")
    public List<Object> queyByist(String hql, Object[] args) {
        Query<?> query = this.getSession().createQuery(hql);
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                query.setParameter(i, args[i]);
            }
        }
        List<?> list = query.list();
        return (List<Object>) list;
    }
    
	/**
	 * 执行sql语句将其转换成List<Map<String,Object>>
	 * 
	 * @param sql
	 * @param paramObj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> queryListMapBySql(String sql, Object... paramObj) {

		Query query = this.getSession().createSQLQuery(sql);

		if (paramObj != null && paramObj.length > 0) {
			for (int i = 0; i < paramObj.length; i++) {
				query.setParameter(i, paramObj[i]);
			}
		} 
		return  query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();	 
	}	  
}
