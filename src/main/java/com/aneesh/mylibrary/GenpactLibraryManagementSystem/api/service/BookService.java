package com.aneesh.mylibrary.GenpactLibraryManagementSystem.api.service;

import java.util.List;
import java.util.Optional;

import com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain.Book;

public interface BookService {
	Optional<Book>  findById(Long bookId);
	List<Book> findAllBooks();
	Book saveBooks(Book book);
	List<Book> findByLibId(Long libId);

}
