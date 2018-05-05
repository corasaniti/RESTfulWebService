package restfulwebservice.services;

import org.springframework.stereotype.Service;

import restfulwebservice.model.Book;

@Service
public class BookService {

    public Book findBookById(int id) {
        return new Book("Java8 in Action","4634758648");
    }
}
