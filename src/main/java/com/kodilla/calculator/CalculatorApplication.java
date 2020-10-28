package com.kodilla.calculator;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calculator = new Calculator();
        calculator.addAtoB();
        System.out.println("it is working");
    }


}
