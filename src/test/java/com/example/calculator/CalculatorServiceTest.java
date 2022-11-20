package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();
    @ParameterizedTest
    @MethodSource("plusTestSuites")
    public void plusTest(int num1, int num2, int result){
        Assertions.assertEquals(result, calculatorService.plus(num1, num2));
    }

    public static List<Arguments> plusTestSuites(){
        return List.of(
                Arguments.of(1, 2, 3),
                Arguments.of(3, 5, 8),
                Arguments.of(7, 2, 9),
                Arguments.of(7, 8, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("minusTestSuites")
    public void minusTest(int num1, int num2, int result){
        Assertions.assertEquals(result, calculatorService.minus(num1, num2));
    }

    public static List<Arguments> minusTestSuites(){
        return List.of(
                Arguments.of(1, 2, -1),
                Arguments.of(3, 5, -2),
                Arguments.of(7, 2, 5),
                Arguments.of(7, 8, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyTestSuites")
    public void multiplyTest(int num1, int num2, int result){
        Assertions.assertEquals(result, calculatorService.multiply(num1, num2));
    }

    public static List<Arguments> multiplyTestSuites(){
        return List.of(
                Arguments.of(1, 2, 2),
                Arguments.of(3, 5, 15),
                Arguments.of(7, 2, 14),
                Arguments.of(7, 8, 56)
        );
    }

    @ParameterizedTest
    @MethodSource("divideTestSuites")
    public void divideTest(int num1, int num2, int result){
        Assertions.assertEquals(result, calculatorService.divide(num1, num2));
    }

    public static List<Arguments> divideTestSuites(){
        return List.of(
                Arguments.of(1, 2, 0),
                Arguments.of(30, 5, 6),
                Arguments.of(7, 2, 3),
                Arguments.of(7, 8, 0)
        );
    }

    @Test
    public void divideByZeroThrowsException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(5, 0);
        });
    }

    @Test
    public void plusByNullParamThrowsException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.plus(0, 1);
        });
    }
}
