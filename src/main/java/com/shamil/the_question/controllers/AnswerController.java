package com.shamil.the_question.controllers;

import com.shamil.the_question.dto.AnswerDto;
import com.shamil.the_question.dto.QuestionDto;
import com.shamil.the_question.models.User;
import com.shamil.the_question.services.AnswerService;
import com.shamil.the_question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @Autowired
    private QuestionService questionService;

    @PostMapping("/questions/{questionId}/answers")
    public String saveAnswer(@PathVariable("questionId") Long questionId,
                             Authentication authentication,
                             AnswerDto answerDto,
                             Model model, //модель может предоставлять атрибуты, используемые для визуализации представлений.
                             BindingResult result) {
        try {
            Optional<User> optionalUser = (Optional<User>) authentication.getPrincipal(); //Optional - Контейнерный объект, который может содержать или не содержать ненулевое значение
            answerDto.setQuestionId(questionId);
            answerService.saveAnswer(answerDto, optionalUser.get());
            QuestionDto question = questionService.getQuestion(questionId);
            model.addAttribute("question", question);
            return "redirect:/questions/{questionId}";
        } catch (Exception e) {
            return "";
        }
    }
}
