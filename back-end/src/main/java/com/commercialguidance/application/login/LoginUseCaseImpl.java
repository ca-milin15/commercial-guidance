package com.commercialguidance.application.login;

import com.commercialguidance.domain.login.User;
import org.springframework.stereotype.Service;

@Service
public class LoginUseCaseImpl implements LoginUseCase {

    private static final int MIN_USERNAME_LENGTH = 3;
    private static final int MIN_PASSWORD_LENGTH = 4;

    @Override
    public User login(String username, String password) {
        boolean active = isAuthenticated(username, password);
        return new User(username == null ? "" : username.trim(), active);
    }

    private boolean isAuthenticated(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        String trimmedUsername = username.trim();
        return trimmedUsername.length() >= MIN_USERNAME_LENGTH
                && password.length() >= MIN_PASSWORD_LENGTH;
    }
}
