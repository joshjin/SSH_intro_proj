package com.josh.ssh.dao;

import java.util.List;
import java.util.Map;
import com.josh.ssh.beans.BookInfo;

public interface BookDao {
	public int addBook(BookInfo bookInfo);
	public List<BookInfo> getBookInfo();
	public void deleteSomeBookInfo(String ids);
	public int getCount();
	public BookInfo getBookInfoByBookId(int bookId);
	public void updateBookInfoByBookId(BookInfo bookInfo);
}
