package com.shamil.the_question.services;

import com.shamil.the_question.dto.AnswerDto;
import com.shamil.the_question.models.User;


import java.util.List;

public interface AnswerService {
    List<AnswerDto> getAllAnswers();
    AnswerDto getAnswer(Long id);
    void saveAnswer(AnswerDto dto, User user);
}
