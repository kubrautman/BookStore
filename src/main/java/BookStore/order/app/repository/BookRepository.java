package BookStore.order.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import BookStore.order.app.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
