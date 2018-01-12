package pl.coderslab.apiBack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.apiBack.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	// Akcja sprawdzająca działanie projektu
	@RequestMapping("/hello")
	public String hello() {
		return "{hello: World}";
	}

	// Akcja sprawdzająca działanie projektu ze zwróceniem obiektu Book 
	@RequestMapping("/test")
	public Book test() {
		return new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming");
	}
}
