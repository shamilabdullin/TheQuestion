package com.shamil.the_question.services;

import com.shamil.the_question.dto.SignUpDto;
import com.shamil.the_question.dto.UserDto;
import com.shamil.the_question.models.User;

public interface SignUpService {
    User signUp(SignUpDto form);
}
