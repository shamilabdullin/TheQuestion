package com.shamil.the_question.services;

import com.shamil.the_question.dto.QuestionDto;
import com.shamil.the_question.models.Question;
import com.shamil.the_question.models.User;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;

public interface QuestionService {
    List<QuestionDto> getAllQuestions();
    QuestionDto getQuestion(Long id);
    void saveQuestion(QuestionDto form);
    void addQuestion(QuestionDto form, User user);
    void deleteQuestion(Question question);
    void updateQuestion(QuestionDto form,User user);
}
