package com.nnamanx.calculatorusingtesting.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GeneralResponse<T> {

    String message;
    HttpStatus status;
    LocalDateTime timeStamp;
    T data;

    public static <T> GeneralResponse<T> of(T data, HttpStatus status) {

        return buildGeneralResponse(data, status, status.name());
    }

    public static <T> GeneralResponse<T> of(T data, String message) {

        return buildGeneralResponse(data, HttpStatus.OK, message);
    }

    private static <T> GeneralResponse<T> buildGeneralResponse(T data, HttpStatus status, String message) {
        
        return GeneralResponse.<T>builder()
                .data(data)
                .status(status)
                .message(message)
                .timeStamp(LocalDateTime.now())
                .build();
    }

}