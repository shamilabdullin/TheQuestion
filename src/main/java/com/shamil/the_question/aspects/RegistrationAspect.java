package com.shamil.the_question.aspects;

import com.shamil.the_question.dto.SignUpDto;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class RegistrationAspect {

    @After(value = "execution(* com.shamil.the_question.controllers.SignUpController.getSignUpPage(*))") //после тест-метода
    public void getPage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        SignUpDto user = (SignUpDto) args[0];
        log.info("Пользователь - открыл регистрацию");
    }

    @Before(value = "execution(* com.shamil.the_question.controllers.SignUpController.signUp(*))") //перед каждым тестом
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        SignUpDto user = (SignUpDto) args[0];
        log.info("Пользователь - " + user + " начал регистрацию");
    }

    @AfterReturning(value = "execution(* com.shamil.the_question.controllers.SignUpController.signUp(*))") //аннотированные методы запускаются после того, как метод (соответствует выражению pointcut) выполняется нормально и не выдает никаких ошибок, исключений.
    public void after(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        SignUpDto user = (SignUpDto) args[0];
        log.info("Пользователь - " + user + " завершил регистрацию");
    }
}
