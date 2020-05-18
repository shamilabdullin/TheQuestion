package com.shamil.the_question.aspects;

import com.shamil.the_question.dto.SignUpDto;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AuthAspect {

    @After(value = "execution(* com.shamil.the_question.controllers.LogInController.getLogInPage(*))")
    public void getPage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        SignUpDto user = (SignUpDto) args[0];
        log.info("Пользователь - открыл страницу авторизации");
    }
}