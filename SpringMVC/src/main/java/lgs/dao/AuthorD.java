package lgs.dao;

import java.util.List;

import lgs.entity.Author;

public interface AuthorD {
	void save(Author author);
	List<Author> findAll();
	Author findOne(int ids);

}
