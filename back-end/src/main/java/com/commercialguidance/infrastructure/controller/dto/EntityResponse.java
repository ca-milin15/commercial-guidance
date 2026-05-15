package com.commercialguidance.infrastructure.controller.dto;

public record EntityResponse<T>(T data, String message) {

    public static <T> EntityResponse<T> of(T data) {
        return new EntityResponse<>(data, "OK");
    }

    public static <T> EntityResponse<T> of(T data, String message) {
        return new EntityResponse<>(data, message);
    }
}
