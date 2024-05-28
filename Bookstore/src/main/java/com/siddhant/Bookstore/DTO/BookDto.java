package com.siddhant.Bookstore.DTO;

import com.siddhant.Bookstore.Entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private String bookName;
    private String author;
}
