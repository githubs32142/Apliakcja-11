package pl.techstyle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.techstyle.model.Book;
import pl.techstyle.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	public List<Book> getAll(){
		return repository.findAll();
	}
	
	
	public void add(Book b) {
		repository.save(b);
	}
}
