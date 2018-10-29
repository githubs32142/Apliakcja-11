package pl.techstyle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.techstyle.model.PublisherBook;
import pl.techstyle.model.Result;
import pl.techstyle.repository.PublisherBookRepository;

@Service
public class PublisherBookService {
	@Autowired
	PublisherBookRepository repository;
	
	public List<PublisherBook> getAll(){
		return repository.findAll();
	}
	
	
	public void add(PublisherBook b) {
		repository.save(b);
	}
	public List<Result> getResult(){
		return repository.getResult();
	}

}
