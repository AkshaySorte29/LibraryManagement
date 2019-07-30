package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
