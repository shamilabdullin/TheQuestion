package com.shamil.the_question.services;

import com.shamil.the_question.dto.SignUpDto;
import com.shamil.the_question.models.User;
import com.shamil.the_question.repositories.UserRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
@Builder
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User signUp(SignUpDto form) {
        User user = User.builder()
                .email(form.getEmail())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .gender(form.getGender())
                .country(form.getCountry())
                .date(form.getDate())
                .build();
        usersRepository.save(user);
        return user;
    }
}
