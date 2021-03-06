package com.kassandraortega.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return (List<Book>) Arrays.asList(new Book(1l, "Mastering Spring 5.0", "Ranga Karanam"));
	}
}
