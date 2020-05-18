package com.shamil.the_question.controllers;

import com.shamil.the_question.dto.AnswerDto;
import com.shamil.the_question.models.Answer;
import com.shamil.the_question.services.AnswerServiceImpl;
import com.shamil.the_question.services.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AnswerController {

    @Autowired
    private AnswerServiceImpl answerService;


    @GetMapping("/questions/{id}/answers")
    public String getAnswersPage(@PathVariable("id") Long id, ModelMap map, Model model){
        Answer answer = answerService.getAnswerr(id);
        return answer.getBody();
    }
}
