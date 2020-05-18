package com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book")
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2859990809549911757L;
	
	
	@Id
	@GeneratedValue
	private Long bookId;
	
	@Column(name="bookName" ,nullable= false)
	private String bookName;
	
	@Column(name="bookDesc",nullable=false)
	private String description;
	
	@Column(name="libId")
	private Long libId;
	
	@Column(name="issueDate")
	private Instant issueDate;
	
	@Column(name="returnDate")
	private Instant returnDate;
	
	@Column(name="book_price")
	private Double price;
	
	public Book() {
		super();
	}
	


	public Book(Long bookId, String bookName, String description, Long libId, Instant issueDate, Instant returnDate,
			Double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.description = description;
		this.libId = libId;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.price = price;
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

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLibId(Long libId) {
		this.libId = libId;
	}

	public void setIssueDate(Instant issueDate) {
		this.issueDate = issueDate;
	}

	public Double getPrice() {
		return price;
	}

	public Instant getReturnDate() {
		return returnDate;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setReturnDate(Instant returnDate) {
		this.returnDate = returnDate;
	}

	
	

}
