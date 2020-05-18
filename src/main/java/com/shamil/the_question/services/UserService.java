package com.shamil.the_question.services;

import com.shamil.the_question.dto.UserDto;
import com.shamil.the_question.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> getAllUsers();
    void deleteUser(Long userId);
    User getUser(Long userId);
    Optional<User> getUserByEmail(String email);
}
