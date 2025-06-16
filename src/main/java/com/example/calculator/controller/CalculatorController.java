package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.model.SumResponse;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public SumResponse add(@RequestParam(value = "operands", required = false) String operands) {
        double sum = 0.0;

        if (operands != null && !operands.trim().isEmpty()) {
            try {
                String[] parts = operands.split(",");
                for (String part : parts) {
                    sum += Double.parseDouble(part.trim());
                }
            } catch (NumberFormatException e) {
                // Return 0 or handle as needed
                return new SumResponse(0.0);
            }
        }

        return new SumResponse(sum);
    }
}
