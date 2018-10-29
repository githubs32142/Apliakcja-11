package pl.techstyle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pl.techstyle.model.PublisherBook;
import pl.techstyle.model.Result;
@Repository
public interface PublisherBookRepository extends JpaRepository<PublisherBook, Integer> {
	
	@Query("Select new pl.techstyle.model.Result( p.publisher.namePublisher, p.book.title , p.date) From PublisherBook p")
	public List<Result> getResult();


}
