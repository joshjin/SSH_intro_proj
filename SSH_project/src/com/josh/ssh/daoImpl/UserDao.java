package com.josh.ssh.daoImpl;
import javax.annotation.Resource;

//import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
//import org.hibernate.SessionFactory;
//import org.hibernate.Session;  
//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
//import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.josh.ssh.dao.BaseDao;

@Transactional
public class UserDao implements BaseDao{
	//private Session session;  
	
	/*
	@Override  
	public Session getSession() {  
		return session;  
	}  
		
	@Override  
	public void setSession(Session session) {  
		this.session = session;  
	}  
	*/
	
    @Resource
    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;}
    public void setSessionFactory(SessionFactory sessionFactory) {
         this.sessionFactory = sessionFactory;
    }
    
    @Transactional
	public void saveObject(Object obj) throws HibernateException {
		sessionFactory.getCurrentSession().save(obj);
	}
    
	//@Override  
	//public void saveObject(Object obj) throws HibernateException {  
	//	//this.getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
	//	getHibernateTemplate().save(obj);
	//}  
}