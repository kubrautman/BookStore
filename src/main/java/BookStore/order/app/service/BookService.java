package BookStore.order.app.service;

import java.util.Optional;

import org.springframework.stereotype.Service;


import BookStore.order.app.model.Book;
import BookStore.order.app.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public Optional<Book> findBookById(Integer bookId) {
		
		return bookRepository.findById(bookId);
		
	}
}
