package lgs.service;

import java.util.List;

import lgs.entity.Book;

public interface BookS {
 
	void save(String title);
	List<Book> findAll();
	Book findOne(int id);
}
