package com.kodilla.calculator;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calculator = new Calculator();
        double result = calculator.addAtoB(5, 2);
        System.out.println("it is working");
        System.out.println(result);
    }


}
