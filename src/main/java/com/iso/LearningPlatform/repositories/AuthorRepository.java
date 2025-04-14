package com.iso.LearningPlatform.repositories;

import com.iso.LearningPlatform.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
