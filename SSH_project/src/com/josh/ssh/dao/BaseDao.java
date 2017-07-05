package com.josh.ssh.dao;

import org.hibernate.HibernateException;  
import org.springframework.transaction.annotation.Transactional;
//import org.hibernate.Session;
//import org.springframework.transaction.annotation.Propagation;

@Transactional
public interface BaseDao {
	/*
	public void saveObject(Object obj) throws HibernateException;  
    
    public Session getSession();  
  
    public void setSession(Session session);  
    */
	
	//@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
	@Transactional
	public void saveObject(Object obj) throws HibernateException;  
	  
}