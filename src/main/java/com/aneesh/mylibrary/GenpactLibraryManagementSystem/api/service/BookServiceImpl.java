package com.aneesh.mylibrary.GenpactLibraryManagementSystem.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain.Book;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Optional<Book> findById(Long bookId) {
		
		return bookRepository.findById(bookId);
	}

	@Override
	public List<Book> findAllBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public Book saveBooks(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public List<Book> findByLibId(Long libId) {
		return bookRepository.findByLibId(libId);
	}

}
