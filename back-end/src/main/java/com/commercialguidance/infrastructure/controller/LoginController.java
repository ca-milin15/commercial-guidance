package com.commercialguidance.infrastructure.controller;

import com.commercialguidance.application.login.LoginUseCase;
import com.commercialguidance.domain.login.User;
import com.commercialguidance.infrastructure.controller.dto.EntityResponse;
import com.commercialguidance.infrastructure.controller.dto.LoginRequest;
import com.commercialguidance.infrastructure.controller.dto.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

    private final LoginUseCase loginUseCase;

    public LoginController(LoginUseCase loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<EntityResponse<LoginResponse>> login(@RequestBody LoginRequest request) {
        User user = loginUseCase.login(request.username(), request.password());
        LoginResponse body = new LoginResponse(user.username(), user.active());
        String message = user.active() ? "Login successful" : "Invalid credentials";
        return ResponseEntity.ok(EntityResponse.of(body, message));
    }
}
