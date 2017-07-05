package com.josh.ssh.daoImpl;

import java.util.*;

import javax.annotation.Resource;
import javax.management.Query;

import oracle.sql.DATE;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.josh.ssh.beans.BookInfo;
import com.josh.ssh.dao.BookDao;

@Transactional
public class BookDaoImpl implements BookDao{
	
    @Resource
    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;}
    public void setSessionFactory(SessionFactory sessionFactory) {
         this.sessionFactory = sessionFactory;
    }

    @Transactional
	@Override
	public int addBook(BookInfo bookInfo) throws HibernateException{
    	int result = 0;
    	if (bookInfo.getPublishdate() == null) {
    		bookInfo.setPublishdate(new DATE().timestampValue());
		}
		if (bookInfo.getPrice() == null || "".equals(bookInfo.getPrice())) {
			bookInfo.setPrice(0.00);
		}
    	try {
    		result = (Integer) sessionFactory.getCurrentSession().save(bookInfo); 
    	} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

    @Transactional
	@Override
	public List<BookInfo> getBookInfo() throws HibernateException{
		org.hibernate.Session session = null;
		String sql = "SELECT * FROM BOOKLIB b";
		List<BookInfo> list = null;
		try {
			session = sessionFactory.getCurrentSession();
			org.hibernate.Query query = session.createQuery(sql);
			list = (List<BookInfo>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.clear();
		}
		return list;
	}

    @Transactional
	@Override
	public void deleteSomeBookInfo(String ids) throws HibernateException{
		org.hibernate.Session session = null;
		String sql = "DELETE FROM BOOKLIB where AUTO_ID in (" + ids + ")";
		try {
			session = sessionFactory.getCurrentSession();
			org.hibernate.Query query = session.createQuery(sql);
			query.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.clear();
		}
	}

    @Transactional
	@Override
	public int getCount() throws HibernateException{
		org.hibernate.Session session = null;
		String sql = "SELECT COUNT(*) FROM BOOKLIB b where 1=1";
		int count = 0;
		try {
			session = sessionFactory.getCurrentSession();
			org.hibernate.Query query = session.createQuery(sql);
			count = Integer.valueOf(query.uniqueResult() + "");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.clear();
		}
		return count;
	}

    @Transactional
	@Override
	public BookInfo getBookInfoByBookId(int bookId) throws HibernateException{
    	BookInfo bookInfo = null;
    	org.hibernate.Session session = null;
    	String sql = "FROM BOOKLIB b where b.AUTO_ID=" + bookId;
    	try {
			session = sessionFactory.getCurrentSession();
			org.hibernate.Query query = session.createQuery(sql);
			bookInfo = (BookInfo) query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.clear();
		}
		return null;
	}

    @Transactional
	@Override
	public void updateBookInfoByBookId(BookInfo bookInfo) throws HibernateException{
    	try {
    		sessionFactory.getCurrentSession().update(bookInfo); 
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }	
}
