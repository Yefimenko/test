package lgs.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import lgs.dao.AuthorD;
import lgs.entity.Author;
@Repository
public class AuthorDI implements AuthorD {
	
	@PersistenceContext
	EntityManager manager;
	public void save(Author author) {
		manager.persist(author);
		
	}

	public List<Author> findAll() {

		return manager.createQuery("from Author", Author.class).getResultList();
	}

	public Author findOne(int id) {
		return manager.find(Author.class, id);
	}
	
	

}
