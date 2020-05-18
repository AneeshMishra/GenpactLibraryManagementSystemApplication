package com.aneesh.mylibrary.GenpactLibraryManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByLibId(Long libId);
	

}
