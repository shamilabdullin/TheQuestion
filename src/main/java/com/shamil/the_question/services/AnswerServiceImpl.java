package com.shamil.the_question.services;

import com.shamil.the_question.dto.AnswerDto;
import com.shamil.the_question.dto.QuestionDto;
import com.shamil.the_question.models.Answer;
import com.shamil.the_question.models.Question;
import com.shamil.the_question.models.User;
import com.shamil.the_question.repositories.AnswerRepository;
import com.shamil.the_question.repositories.QuestionRepository;
import com.shamil.the_question.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService{

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<AnswerDto> getAllAnswers() {
        return null;
    }

    @Override
    public AnswerDto getAnswer(Long id) {
        return null;
    }

    public Answer getAnswerr(Long id) {

        return answerRepository.findAnswerById(id);
    }

    @Override
    public void saveAnswer(AnswerDto form) {

    }

    public void addAnswer(AnswerDto form, User user){
        Answer answer = Answer.builder()
                .id(form.getId())
                .body(form.getBody())
                .user(user)
                .build();
                answerRepository.save(answer);
    }
}
