package com.josh.ssh.service;

import java.util.List;

import com.josh.ssh.beans.BookInfo;

public interface BookManager {
	public int addBookInfo(BookInfo bookInfo);
	public List<BookInfo> getBookInfo();
	public void deleteSomeBookInfo(String ids);
	public int getCount();
	public BookInfo getBookInfoByBookId(int bookId);
	public void updateBookInfoByBookId(BookInfo bookInfo);
}
