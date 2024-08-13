package com.datorium.Datorium.API;

import com.datorium.Datorium.API.DTOs.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name); // "Hello " + name;
	}

	@GetMapping("/getbook")//localhost:8080/getbook
	public Book getBook(){
		var book = new Book();
		book.title = "book title";
		book.author = "book author";

		return book;
	}

	@PostMapping("/postexample")
	public Book addBook(@RequestBody Book book){
		book.title = book.title.toUpperCase();
		return book;
	}

	@PostMapping("/authorize")
	public User authorize(@RequestBody Credentials credentials){ // username + password
		if(credentials.username.equals("gerlitm") && credentials.password.equals("password")){
			var user = new User();
			user.name = "Gerli";
			return user;
		}
		return null;
	}

	@PostMapping("/christmas")
	public Gift christmas(@RequestBody Christmas christmas) {
		var gift = new Gift();
		if (christmas.giftNumber == 1) {
			gift.name = "Toy car";
		} else if (christmas.giftNumber == 2) {
			gift.name = "Doll";
		} else if (christmas.giftNumber == 3) {
			gift.name = "Board game";
		} else {
			gift.name = "Gift card";
		}
		return gift;
	}
}
