package com.josh.ssh.serviceImpl;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.josh.ssh.forms.UserForm;
import com.josh.ssh.service.UserManager;
import com.josh.ssh.beans.User;
import com.josh.ssh.dao.BaseDao;

@Transactional
public class UserManagerImpl implements UserManager {
	
    private BaseDao dao;  
    
    public void setDao(BaseDao dao) {  
        this.dao = dao;  
    }  
    
    @Transactional
    @Override  
    public void regUser(UserForm userForm) throws HibernateException {  
        User user = new User();  
        BeanUtils.copyProperties(userForm, user);  
        
        dao.saveObject(user);  
    }  
    
	/*
    private BaseDao dao;  
    
    private Session session;  
	
    public UserManagerImpl() {  
        dao = new UserDao();  
    }  
    
    @Override  
    public void regUser(UserForm userForm) {
        session = HibernateSessionFactory_tmp.currentSession();  
        dao.setSession(session);  
        Transaction ts = session.beginTransaction();  
        User user = new User();  
        user.setUsername(userForm.getUsername());  
        user.setPassword(userForm.getPassword());  
        user.setGender(userForm.getGender());  
        dao.saveObject(user);  
        ts.commit();  
        HibernateSessionFactory_tmp.closeSession();  

    }
    */
}  