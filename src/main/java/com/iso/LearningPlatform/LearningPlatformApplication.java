package com.iso.LearningPlatform;

import com.iso.LearningPlatform.models.Author;
import com.iso.LearningPlatform.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningPlatformApplication.class, args);
	}

	@Bean
	public CommandLineRunner commendLineRunner(
		AuthorRepository authorRepository
	){
		return args -> {
			var author = Author.builder()
					.firstname("Pero")
					.lastname("Peric")
					.age(23)
					.email("pperic@etfos.hr")
					.build();

			authorRepository.save(author);
		};
	}
}
