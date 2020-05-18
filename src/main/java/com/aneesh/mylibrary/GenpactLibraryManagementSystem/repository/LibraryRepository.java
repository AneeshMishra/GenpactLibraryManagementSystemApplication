package com.aneesh.mylibrary.GenpactLibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

}
