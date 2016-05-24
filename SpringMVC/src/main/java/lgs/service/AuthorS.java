package lgs.service;

import java.util.List;

import lgs.entity.Author;

public interface AuthorS {

	void save(String name);
	List<Author> findAll();
	Author findOne(int id);
}
