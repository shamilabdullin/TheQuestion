package com.shamil.the_question.controllers;

import com.shamil.the_question.dto.QuestionDto;
import com.shamil.the_question.models.User;
import com.shamil.the_question.services.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class QuestionController {

    @Autowired
    private QuestionServiceImpl questionService;

    @GetMapping("/questions")
    public String getQuestionsPage(Model model) {
        List<QuestionDto> questions = questionService.getAllQuestions();
        model.addAttribute("questions", questions);
        return "question_list";
    }

    @GetMapping
    @RequestMapping("/questions/{id}") //Аннотация @RequestMapping предназначена для того, чтобы задать методам вашего контроллера адреса, по которым они будут доступны на клиенте
    public String getQuestion(@PathVariable Long id, Model model) {
        QuestionDto question = questionService.getQuestion(id);
        model.addAttribute("question", question);
        return "question";
    }

    @GetMapping("/questions/new-question")
    public String questionCreate(Authentication authentication) {
        if (authentication != null)
            return "question_enter";
        else
            return "redirect:/signIn";
    }

    @PostMapping("/questions/new-question")
    public String createQuestion(Authentication authentication,
                                 QuestionDto questionDto,
                                 Model model,
                                 BindingResult result) {
        try {
            Optional<User> optionalUser = (Optional<User>) authentication.getPrincipal();
            questionService.saveQuestion(questionDto, optionalUser.get());
            List<QuestionDto> questions = questionService.getAllQuestions();
            model.addAttribute("questions", questions);
            return "redirect:/questions";
        } catch (Exception e) {
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
