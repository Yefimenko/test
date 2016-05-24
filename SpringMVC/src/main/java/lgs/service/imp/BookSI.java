package lgs.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import lgs.dao.BookD;
import lgs.entity.Book;
import lgs.service.BookS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookSI implements BookS{


	@Autowired
	private BookD bookD;

	@Transactional
	public void save(String title) {
		bookD.save(new Book(title));
	}

	public List<Book> findAll() {
		
		return bookD.findAll();
	}

	public Book findOne(int id) {
		
		return bookD.findOne(id);
	}
	
	
}
