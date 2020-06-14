package com.shamil.the_question.repositories;

import com.shamil.the_question.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
