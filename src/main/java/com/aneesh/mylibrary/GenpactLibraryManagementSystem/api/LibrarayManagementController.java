package com.aneesh.mylibrary.GenpactLibraryManagementSystem.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aneesh.mylibrary.GenpactLibraryManagementSystem.api.service.BookService;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.api.service.LibraryService;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.config.ResponseWrapper;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain.Book;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain.Library;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.model.BookModel;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping(value="/genpactlib")
public class LibrarayManagementController {
	
	@Autowired
	BookService bookService;
	
	@Autowired
	LibraryService libraryService;
	
	
	 public LibrarayManagementController(BookService bookService2, LibraryService libraryService2) {
		// TODO Auto-generated constructor stub
		 
		 
	}

	@PostMapping("/library")
	    public ResponseEntity<Library> createlibrary( @RequestBody Library library) {
		 Library savedLibrary = libraryService.saveLibrary(library);
	    	
	    
	        return ResponseEntity.ok().body(savedLibrary);
	    }
	 
	 @GetMapping("/listLibrary")
	    public ResponseEntity<List <Library>> getLibrary() {
		 
	        return ResponseEntity.ok().body(libraryService.findAllLibrary());
	    }
	 
	 @GetMapping("/listAllBooks")
	    public ResponseEntity<List <BookModel>> getAllBooks() {
		 List<BookModel> bmList= new ArrayList<>();
		 bookService.findAllBooks().forEach(book ->{
			 BookModel bm = new BookModel();
			 bm.setBookId(book.getBookId());
			 bm.setBookName(book.getBookName());
			 bm.setDescription(book.getDescription());
			 bm.setIssueDate(book.getIssueDate());
			 bm.setLibId(book.getLibId());
			 bmList.add(bm);
		 });
	        return ResponseEntity.ok().body(bmList);
	    }

	    @GetMapping("/getBook/{bookId}")
	    public ResponseEntity <BookModel> getBookById(@PathVariable(value = "bookId") Long bookId)
	     {
	    	Optional<Book> book = bookService.findById(bookId);
	    	BookModel bm = new BookModel();
			 bm.setBookId(book.get().getBookId());
			 bm.setBookName(book.get().getBookName());
			 bm.setDescription(book.get().getDescription());
			 bm.setIssueDate(book.get().getIssueDate());
			 bm.setLibId(book.get().getLibId());
	        return ResponseEntity.ok().body(bm);
	    }
	    
	    @GetMapping("/getBookByLibId/{libId}")
	    public ResponseEntity<List<Book>> getBookByLibId(@PathVariable(value = "libId") Long libId)
	     {
	    	List<Book> book = bookService.findByLibId(libId);
	        return ResponseEntity.ok().body(book);
	    }
	    
	    @PostMapping
	    public ResponseEntity<BookModel> createBook( @RequestBody Book book) {
	    	 Book saveBooks = bookService.saveBooks(book);
	    	
	    	BookModel bm = new BookModel();
			 bm.setBookId(saveBooks.getBookId());
			 bm.setBookName(saveBooks.getBookName());
			 bm.setDescription(saveBooks.getDescription());
			 bm.setIssueDate(saveBooks.getIssueDate());
			 bm.setLibId(saveBooks.getLibId());
	        return ResponseEntity.ok().body(bm);
	    }

}
