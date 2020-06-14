package com.shamil.the_question.services;

import com.shamil.the_question.dto.AnswerDto;
import com.shamil.the_question.models.Answer;
import com.shamil.the_question.models.Question;
import com.shamil.the_question.models.User;
import com.shamil.the_question.repositories.AnswerRepository;
import com.shamil.the_question.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<AnswerDto> getAllAnswers() {
        return null;
    }

    @Override
    public AnswerDto getAnswer(Long id) {
        return null;
    }

    @Override
    public void saveAnswer(AnswerDto dto, User user) {
        Question question = questionRepository.findById(dto.getQuestionId()).get();
        Answer answer = Answer.builder()
                .body(dto.getBody())
                .user(user)
                .question(question)
                .date(LocalDate.now().toString())
                .build();
        answerRepository.save(answer);
    }
}
