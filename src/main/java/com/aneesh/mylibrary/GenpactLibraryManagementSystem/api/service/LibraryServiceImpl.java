package com.aneesh.mylibrary.GenpactLibraryManagementSystem.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain.Library;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.repository.LibraryRepository;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	@Autowired
	LibraryRepository libRepository;

	@Override
	public List<Library> findAllLibrary() {
		
		return libRepository.findAll();
	}

	@Override
	public Library saveLibrary(Library library) {
		
		return libRepository.save(library);
	}

}
