package com.desafio.magalu.agendamento.exceptions.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.OffsetDateTime;


@RestControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleIllegalArgumentException(IllegalArgumentException ex, HttpServletRequest request){
        var response = new ErrorResponse(
                OffsetDateTime.now(),
                HttpStatus.UNPROCESSABLE_CONTENT.value(),
                ex.toString(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(response);
    }
}
