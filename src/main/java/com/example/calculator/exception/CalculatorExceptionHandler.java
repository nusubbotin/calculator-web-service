package com.example.calculator.exception;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CalculatorExceptionHandler{

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorMessage> handlerRuntimeException(RuntimeException e){
        ErrorMessage message = new ErrorMessage("Ошибка при выполнении операции: " + e.getMessage());
        return new ResponseEntity<ErrorMessage>(message, HttpStatus.EXPECTATION_FAILED);

    }
}
