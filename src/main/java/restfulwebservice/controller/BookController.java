package restfulwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restfulwebservice.model.Book;
import restfulwebservice.services.BookService;



/*
 *	Book Controller Example
 *  To call in your browser address bar type as follow
 *  http://localhost:8080/books-rest/book/6787 
 *  where 6787 is id of book
 */

@RestController
@RequestMapping("books-rest")
public class BookController {
    
	@Autowired
	BookService bookService;
	   
	//@GetMapping("/{id}", produces = MediaType.APPLICATION_JSON)
	
	@GetMapping(path = "/book/{id}")
	public Book getBook(@PathVariable int id) {
        return bookService.findBookById(id);
    }


}
