package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.OptionalInt;

@RestController
public class CalculatorController {

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1", defaultValue = "0") Integer num1, @RequestParam(name = "num2", defaultValue = "0") Integer num2){
        return num1 + " + " + num2 + " = " + CalculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1", defaultValue = "0") Integer num1, @RequestParam(name = "num2", defaultValue = "0") Integer num2){
        return num1 + " - " + num2 + " = " + CalculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1", defaultValue = "0") Integer num1, @RequestParam(name = "num2", defaultValue = "0") Integer num2){
        return num1 + " * " + num2 + " = " + CalculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", defaultValue = "0") Integer num1, @RequestParam(name = "num2", defaultValue = "0") Integer num2){
        return num1 + " / " + num2 + " = " + CalculatorService.divide(num1, num2);
    }

    @GetMapping("/")
    public String getInfo(){
        return "Добро пожаловать калькулятор";
    }
}
