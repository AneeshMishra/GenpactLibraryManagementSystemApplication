package com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="library")
public class Library implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2859990809549911757L;
	
	@Id
	@GeneratedValue
	@Column(name="libId")
	private Long libId;
	
	@Column(name="libName" ,nullable= false)
	private String libName;

public Library() {
	super();
}
	public Library(Long libId, String libName) {
		super();
		this.libId = libId;
		this.libName = libName;
	}

	public Long getLibId() {
		return libId;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibId(Long libId) {
		this.libId = libId;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	

	
	

}
