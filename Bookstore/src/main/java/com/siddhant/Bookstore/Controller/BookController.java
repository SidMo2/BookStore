package com.siddhant.Bookstore.Controller;

import com.siddhant.Bookstore.DTO.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @GetMapping()
    public ResponseEntity<List<BookDto>> getAllBooks(){
        BookDto bookDto = new BookDto("And then there were none","Agatha Christie");
        List<BookDto> books = new ArrayList<>();
        books.add(bookDto);
        return new ResponseEntity<List<BookDto>>(books, HttpStatus.OK);
    }
}
