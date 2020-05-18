package com.shamil.the_question.controllers;

import com.shamil.the_question.dto.QuestionDto;
import com.shamil.the_question.models.Question;
import com.shamil.the_question.models.User;
import com.shamil.the_question.services.QuestionService;
import com.shamil.the_question.services.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
//@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionServiceImpl questionService;

    @PostMapping
    /*public void writeQuestion(@RequestBody QuestionDto questionDto){
        questionService.saveQuestion(questionDto);
    }*/

    @GetMapping("/questions")
    public String getQuestionsPage(Model model) {
        List<QuestionDto> questions = questionService.getAllQuestions();
        model.addAttribute("questions", questions);
        return "question_list";
    }

    @GetMapping
    @RequestMapping("/questions/{id}")
    public QuestionDto getQuestion(@PathVariable Long id) {
        return questionService.getQuestion(id); // + template
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/questions/new-question")
    public String questionCreate(Authentication authentication) {
        if (authentication!=null)
            return "question_enter";
        else
            return "redirect:/signIn";
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping("/questions/new-question")
    public String createQuestion(Authentication authentication, QuestionDto questionDto, Model model, BindingResult result) {
        try {
            Optional<User> optionalUser = (Optional<User>) authentication.getPrincipal();
            questionService.addQuestion(questionDto,optionalUser.get());
            List<QuestionDto> questions = questionService.getAllQuestions();
            model.addAttribute("questions", questions);
            return "question_list";
        }
        catch (javax.validation.ConstraintViolationException | NullPointerException | NumberFormatException e) {
            return "question_enter_fail";
        }



    }
    /*@PreAuthorize("isAuthenticated()")
    @PostMapping("/question/{id}/delete")
    public String deleteQuestion(@PathVariable("id") Long id,Model model,Authentication authentication) {
        if (authentication!=null) {
            QuestionDto questionDto = questionService.getQuestion(id);
            questionService.deleteQuestion(questionDto);
            List<ItemDto> items = itemService.getAllItems();
            model.addAttribute("items", items);
            return "item_list";
        }else
            return "redirect:/signIn";
    }*/

}
