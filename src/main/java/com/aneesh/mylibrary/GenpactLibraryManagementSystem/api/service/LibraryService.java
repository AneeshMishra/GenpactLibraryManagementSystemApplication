package com.aneesh.mylibrary.GenpactLibraryManagementSystem.api.service;

import java.util.List;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain.Library;

public interface LibraryService {
	List<Library> findAllLibrary();
	Library saveLibrary(Library library);

}
