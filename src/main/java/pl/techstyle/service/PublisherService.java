package pl.techstyle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.techstyle.model.Publisher;
import pl.techstyle.repository.PublisherRepository;

@Service
public class PublisherService {

	@Autowired
	PublisherRepository repository;
	
	public List<Publisher> getAll(){
		return repository.findAll();
	}
	
	
	public void add(Publisher b) {
		repository.save(b);
	}
}
