package com.josh.ssh.serviceImpl;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

import com.josh.ssh.beans.BookInfo;
import com.josh.ssh.dao.BookDao;
import com.josh.ssh.service.BookManager;

@Transactional
public class BookManagerImpl implements BookManager{
	
	//get and set method name must match the type of the variable
	private BookDao dao;

	public void setBookDao(BookDao dao){
		this.dao = dao;
	}
	
	public BookDao getBookDao(){
		return this.dao;
	}

	@Transactional
	@Override
	public int addBookInfo(BookInfo bookInfo) {
		return dao.addBook(bookInfo);
	}

	@Transactional
	@Override
	public List<BookInfo> getBookInfo() {
		return dao.getBookInfo();
	}

	@Transactional
	@Override
	public void deleteSomeBookInfo(String ids) {
		dao.deleteSomeBookInfo(ids);
	}

	@Transactional
	@Override
	public int getCount() {
		return dao.getCount();
	}

	@Transactional
	@Override
	public BookInfo getBookInfoByBookId(int bookId) {
		return dao.getBookInfoByBookId(bookId);
	}

	@Transactional
	@Override
	public void updateBookInfoByBookId(BookInfo bookInfo) {
		dao.updateBookInfoByBookId(bookInfo);
	}
	
}
