package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entity.Book;
import com.example.demo1.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		return bookService.getBooks();
	}
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody final Book book){
		return bookService.addBook(book);
	}

}
