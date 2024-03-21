package com.example.CRUDApplication.controller;

import com.example.CRUDApplication.repo.BookRepo;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepo bookRepo;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
     try {
         List<Book>bookList=new ArrayList<>();
         bookRepo.findAll().forEach(bookList::add);

         if (bookList.isEmpty()){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }

     }catch(Exception ex){
         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR)
     }

    }

    @GetMapping
    public void getBookById(){

    }
    @PostMapping
  public void addBook(){

  }
  @PostMapping
 public void updateBookById(){

 }
@DeleteMapping
 public void deleteBookById(){

 }
}
