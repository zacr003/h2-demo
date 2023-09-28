package com.teamsparq.h2demo;

import com.teamsparq.h2demo.model.Book;
import com.teamsparq.h2demo.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(H2DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(H2DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository) {
		return (args) -> {
			repository.save(new Book(1, "Shantaram", 1000, "Gregory Roberts"));
			repository.save(new Book(2, "The Big Sort", 950, "Bill Bishop"));
			repository.save(new Book(3, "Hummingbird", 450, "Jude Angelini"));
			repository.save(new Book(4, "Paths To God", 675, "Ram Dass"));
			repository.save(new Book(5, "The Color of Magic", 300, "Terry Pratchett"));
		};
	}

}
