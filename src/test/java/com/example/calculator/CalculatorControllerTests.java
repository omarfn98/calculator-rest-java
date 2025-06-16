package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.calculator.controller.CalculatorController;
import com.example.calculator.model.SumResponse;

class CalculatorControllerTest {

    private final CalculatorController controller = new CalculatorController();

    @Test
    void testAdditionMultipleOperands() {
        SumResponse response = controller.add("7,-7");
        assertEquals(0.0, response.getSum());
    }

    @Test
    void testAdditionSingleOperand() {
        SumResponse response = controller.add("42");
        assertEquals(42.0, response.getSum());
    }

    @Test
    void testEmptyOperands() {
        SumResponse response = controller.add("");
        assertEquals(0.0, response.getSum());
    }

    @Test
    void testNullOperands() {
        SumResponse response = controller.add(null);
        assertEquals(0.0, response.getSum());
    }

    @Test
    void testInvalidInput() {
        SumResponse response = controller.add("abc,10");
        assertEquals(0.0, response.getSum()); // or handle it differently if needed
    }
}
