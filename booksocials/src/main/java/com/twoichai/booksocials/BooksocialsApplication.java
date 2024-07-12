package com.twoichai.booksocials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BooksocialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksocialsApplication.class, args);
	}

}
