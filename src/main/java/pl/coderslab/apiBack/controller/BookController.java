package pl.coderslab.apiBack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.apiBack.model.Book;
import pl.coderslab.apiBack.model.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService bookService;

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

	// Akcja zwracająca listę książek
	@GetMapping("")
	public List<Book> getList() {
		return this.bookService.getList();
	}

	// Akcja zwracająca jedną książkę o podanym id
	@GetMapping("/{id}")
	public Book getById(@PathVariable long id) {
		return this.bookService.getById(id);
	}

	// Akcja dodaje książkę do listy
	@PostMapping("")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.add(book);
	}

	// Akcja usuwa książkę o danym id z listy
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable long id) {
		this.bookService.deleteById(id);
		return "{result: ok}";
	}

	// Akcja edytuje książkę o danym id z listy
	@PutMapping("/{id}")
	public String editBook(@PathVariable long id, @RequestBody Book book) {
		this.bookService.edit(book);
		return "{result: ok}";
	}
}
