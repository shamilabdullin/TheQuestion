package com.shamil.the_question.services;

import com.shamil.the_question.dto.QuestionDto;
import com.shamil.the_question.models.Question;
import com.shamil.the_question.models.User;
import com.shamil.the_question.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<QuestionDto> getAllQuestions() {
        return QuestionDto.from(questionRepository.findAll());
    }

    @Override
    @Transactional //Используя @Transactional, многие важные аспекты как распространяемость транзакций (propagation) обрабатываются автоматически.
    public QuestionDto getQuestion(Long id) {
        Question question = questionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Question not found"));
        return QuestionDto.from(question);
    }

    @Override
    public void saveQuestion(QuestionDto form, User user) {
        Question question = new Question();
        question.setBody(form.getBody());
        question.setUser(user);
        questionRepository.save(question);
    }


    @Override
    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }

    @Override
    public void updateQuestion(QuestionDto form, User user) {

    }
}
