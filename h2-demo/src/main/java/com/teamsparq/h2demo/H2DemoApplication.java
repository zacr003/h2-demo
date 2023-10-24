package com.teamsparq.h2demo;

import com.teamsparq.h2demo.entity.User;

import com.teamsparq.h2demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
public class H2DemoApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(H2DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(H2DemoApplication.class, args);
	}


	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}


}


	//	@Bean
//	CommandLineRunner commandLineRunner(UserRepository repository) {
//		return (args) -> {
//			repository.save(new User("zcr03", "zcr03@hotmail.com", "password"));
//		};
//	}


//
//			// fetch all Books
//
//			log.info("Books found with findAll():");
//			log.info("-------------------------------");
//			for (Book book : repository.findAll()) {
//				log.info(book.toString());
//			}
//			log.info("");
//
//			// fetch an individual Book by ID
//			Optional<Book> book = repository.findById(2);
//			log.info("Book found with findById(2):");
//			log.info("--------------------------------");
//			log.info(book.toString());
//			log.info("");
//
//
//			// fetch title of Book
//			log.info("Book found with title('Shantaram'):");
//			log.info("--------------------------------------------");
//			repository.findByTitle("Shantaram").forEach(shantaram -> {
//				log.info(shantaram.toString());
//			});
//			log.info("");
//
//			// fetch Book by Author
//			log.info("Book found by author('Ram Dass'):");
//			log.info("--------------------------------------------");
//			repository.findByAuthor("Ram Dass").forEach(dass -> {
//				log.info(dass.toString());
//			});
//			log.info("");
//
//			// fetch Books by page amount
//			log.info("Book found by findByPages('450'):");
//			log.info("--------------------------------------------");
//			repository.findByPages(450).forEach(pageAmount -> {
//				log.info(pageAmount.toString());
//			});
////			log.info("");
//		};
//	}


