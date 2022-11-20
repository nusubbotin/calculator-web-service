package com.example.calculator.service;

import org.springframework.stereotype.Service;

import java.util.OptionalInt;

@Service

public class CalculatorService {

    private void validationParams(Integer operand1, Integer operand2){
        if (operand1 == null || operand2 == null){
            throw new IllegalArgumentException("Оба операнда должны быть переданны");
        }
    }
    public Integer plus(Integer operand1, Integer operand2){
        validationParams(operand1, operand2);
        return operand1 + operand2;
    }

    public Integer minus(Integer operand1, Integer operand2){
        validationParams(operand1, operand2);
        return operand1 - operand2;
    }

    public Integer multiply(Integer operand1, Integer operand2){
        validationParams(operand1, operand2);
        return operand1 * operand2;
    }

    public Integer divide(Integer operand1, Integer operand2){
        if (operand2 == 0) {
            throw new IllegalArgumentException("Делитель не может быть 0");
        }
        validationParams(operand1, operand2);
        return (Integer) operand1 / operand2;
    }

}
