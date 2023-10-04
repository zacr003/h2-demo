package com.teamsparq.h2demo;

import com.teamsparq.h2demo.entity.Book;
import com.teamsparq.h2demo.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import java.util.Optional;

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


			// fetch all Books

			log.info("Books found with findAll():");
			log.info("-------------------------------");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
			log.info("");

			// fetch an individual Book by ID
			Optional<Book> book = repository.findById(2);
			log.info("Book found with findById(2):");
			log.info("--------------------------------");
			log.info(book.toString());
			log.info("");


			// fetch title of Book
			log.info("Book found with title('Shantaram'):");
			log.info("--------------------------------------------");
			repository.findByTitle("Shantaram").forEach(shantaram -> {
				log.info(shantaram.toString());
			});
			log.info("");

			// fetch Book by Author
			log.info("Book found by author('Ram Dass'):");
			log.info("--------------------------------------------");
			repository.findByAuthor("Ram Dass").forEach(dass -> {
				log.info(dass.toString());
			});
			log.info("");

			// fetch Books by page amount
			log.info("Book found by findByPages('450'):");
			log.info("--------------------------------------------");
			repository.findByPages(450).forEach(pageAmount -> {
				log.info(pageAmount.toString());
			});
			log.info("");
		};
	}
}

