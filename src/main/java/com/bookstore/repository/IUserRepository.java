package com.bookstore.repository;

import com.bookstore.model.Role;
import com.bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String username);

    void updateUserRole(Long username, Role admin);
}
