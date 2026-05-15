package com.commercialguidance.application.login;

import com.commercialguidance.domain.login.User;

public interface LoginUseCase {

    User login(String username, String password);
}
