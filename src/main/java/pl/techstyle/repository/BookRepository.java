package pl.techstyle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.techstyle.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
