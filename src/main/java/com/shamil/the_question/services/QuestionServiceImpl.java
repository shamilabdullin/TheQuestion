package com.shamil.the_question.services;

import com.shamil.the_question.dto.QuestionDto;
import com.shamil.the_question.models.Question;
import com.shamil.the_question.models.User;
import com.shamil.the_question.repositories.QuestionRepository;
import com.shamil.the_question.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private UserRepository userRepository;

    public List<QuestionDto> getQuestions() {
        List<Question> questions = questionRepository.findAll();
        return QuestionDto.from(questions);
    }

    @Override
    public List<QuestionDto> getAllQuestions() {
        return QuestionDto.from(questionRepository.findAll());
    }

    public QuestionDto getQuestion(Long id) {
        Question question = questionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Question not found"));
        return QuestionDto.from(question);
    }

    @Override
    public void saveQuestion(QuestionDto form) {

    }


    @Override
    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }

    @Override
    public void updateQuestion(QuestionDto form, User user) {

    }

    /*@Override
    public void saveQuestion(QuestionDto questionDto) {
        Question question = new Question();
        question.setBody(questionDto.getBody());
        User user = userRepository.findById(questionDto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        question.setUser_id(user.getId());
        questionRepository.save(question);
    }*/

    @Override
    public void addQuestion(QuestionDto form, User user) {
        Question question = new Question();
        question.setBody(form.getBody());
        question.setUser(user);
        questionRepository.save(question);
    }
}
