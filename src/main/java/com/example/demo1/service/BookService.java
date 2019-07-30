package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.entity.Book;
import com.example.demo1.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}
	
	public String addBook(Book book) {
		bookRepository.save(book);
		return "Book Saved Successfully";
	}

}
