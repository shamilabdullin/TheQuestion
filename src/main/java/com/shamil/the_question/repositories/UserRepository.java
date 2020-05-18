package com.shamil.the_question.repositories;

import com.shamil.the_question.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User>findByEmail(String Email);
    User findUserById(Long id);
}
