package com.example.calculator.service;

import org.springframework.stereotype.Service;

import java.util.OptionalInt;

@Service

public class CalculatorService {

    private static void validationParams(Integer operand1, Integer operand2){
        if (operand1 == 0 || operand2 == 0){
            throw new IllegalArgumentException("Оба операнда должны быть переданны");
        }
    }
    public static Integer plus(Integer operand1, Integer operand2){
        validationParams(operand1, operand2);
        return operand1 + operand2;
    }

    public static Integer minus(Integer operand1, Integer operand2){
        validationParams(operand1, operand2);
        return operand1 - operand2;
    }

    public static Integer multiply(Integer operand1, Integer operand2){
        validationParams(operand1, operand2);
        return operand1 * operand2;
    }

    public static Integer divide(Integer operand1, Integer operand2){
        if (operand2 == 0) {
            throw new IllegalArgumentException("Делитель не может быть 0");
        }
        validationParams(operand1, operand2);
        return (Integer) operand1 / operand2;
    }

}
