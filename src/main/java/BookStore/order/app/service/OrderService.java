package BookStore.order.app.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	
	private final BookService bookService;
	
	public OrderService(BookService bookService){
		this.bookService = bookService;
		
	}
	
}
