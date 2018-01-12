package pl.coderslab.apiBack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
    public class BookController {
	
		// Akcja sprawdzająca działanie projektu
        @RequestMapping("/hello")
        public String hello(){
            return "{hello: World}";
        }
        
        
    }
