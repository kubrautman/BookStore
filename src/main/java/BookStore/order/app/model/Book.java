package BookStore.order.app.model;

import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Table
@Getter
@Setter
public class Book {
	private Integer Id;
	
	private String name;
	private String author;
	private Double price;
	private Integer stock;
	

}
