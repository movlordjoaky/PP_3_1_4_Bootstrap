package ru.kata.spring.boot_security.demo.models;

import org.springframework.stereotype.Component;

// удалить аннотацию?
@Component
public class UserRole {
    public static final String ADMIN = "ROLE_ADMIN";
    public static final String COMMON_USER = "ROLE_COMMON_USER";
}
