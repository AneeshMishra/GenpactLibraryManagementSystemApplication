package com.aneesh.mylibrary.GenpactLibraryManagementSystem.model;

import java.time.Instant;



public class BookModel {

	private Long bookId;

	private String bookName;

	private String description;

	private Long libId;

	private Instant issueDate;
	
	public BookModel() {
		
	}

	public BookModel(Long bookId, String bookName, String description, Long libId, Instant issueDate) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.description = description;
		this.libId = libId;
		this.issueDate = issueDate;
	}

	public Long getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getDescription() {
		return description;
	}

	public Long getLibId() {
		return libId;
	}

	public Instant getIssueDate() {
		return issueDate;
	}

	public void setBookId(Long long1) {
		this.bookId = long1;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLibId(Long long1) {
		this.libId = long1;
	}

	public void setIssueDate(Instant issueDate) {
		this.issueDate = issueDate;
	}
	
	

}
