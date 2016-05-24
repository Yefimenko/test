package lgs.dao;

import java.util.List;

import lgs.entity.Book;

public interface BookD {
	void save(Book book);
	List<Book> findAll();
	Book findOne(int id);

}
