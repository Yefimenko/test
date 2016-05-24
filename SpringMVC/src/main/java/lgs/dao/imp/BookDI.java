package lgs.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import lgs.dao.BookD;
import lgs.entity.Book;

import org.springframework.stereotype.Repository;

@Repository
public class BookDI implements BookD{
	@PersistenceContext
	EntityManager manager;
	
	public void save(Book book) {
	manager.persist(book);
	}

	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return manager.createQuery("from Book", Book.class).getResultList();
	}

	public Book findOne(int id) {
		// TODO Auto-generated method stub
		return manager.find(Book.class, id);
	}
	
}
