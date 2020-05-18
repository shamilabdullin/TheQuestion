package com.shamil.the_question.repositories;

import com.shamil.the_question.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    Answer findAnswerById(Long id);
}
