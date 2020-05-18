package com.aneesh.mylibrary.GenpactLibraryManagementSystem.api;

import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.time.Instant;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.aneesh.mylibrary.GenpactLibraryManagementSystem.api.service.BookService;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.api.service.LibraryService;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.domain.Book;
import com.aneesh.mylibrary.GenpactLibraryManagementSystem.model.BookModel;


@RunWith(SpringJUnit4ClassRunner.class)
public class LibrarayManagementControllerTest {
	
	  private MockMvc mockMvc;
	
	@InjectMocks
	LibrarayManagementController librarayManagementController;
	
	@Mock
	BookService bookService;
	
	@Mock
	LibraryService libraryService;
	
	
	@Before
    public void setUp()throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(librarayManagementController)
                .build();
    }
	
	@Test
    public void testAddEmployee() throws Exception 
    {
		mockMvc.perform(MockMvcRequestBuilders.get("/genpactlib/listAllBooks"))
		.andExpect(MockMvcResultMatchers.status().isOk()).andExpect(jsonPath("$.", Matchers.hasSize(1)));
        Instant issueDate= Instant.now();
        Instant returnDate= Instant.now();
        Book book = new Book(Long.valueOf(1),
        		"java 8",
        		"java 8 is new earra",
        		Long.valueOf(1),
        		issueDate,
        		returnDate,20.0);
        when(bookService.saveBooks(book)).thenReturn(book);
      
        
        ResponseEntity<BookModel> responseEntity = librarayManagementController.createBook(book);
         
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
        assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/genpactlib");
    }

}
