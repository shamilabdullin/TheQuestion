package com.shamil.the_question.services;

import com.shamil.the_question.dto.AnswerDto;


import java.util.List;

public interface AnswerService {
    List<AnswerDto> getAllAnswers();
    AnswerDto getAnswer(Long id);
    void saveAnswer(AnswerDto form);
}
