package com.nnamanx.calculatorusingtesting;

import com.nnamanx.calculatorusingtesting.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTesting {

    @InjectMocks
    private CalculatorService calculatorService;


    //    ADDITION
    @Test
    public void testAddNo0() {

        Integer result = calculatorService.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    public void testAddNo1() {

        Double result = calculatorService.add(2.5, 3.7);

        assertEquals(6.2, result);
    }

    @Test
    public void testAddNo2() {

        String result = calculatorService.add("6", "4");

        assertEquals("10", result);
    }


    //  SUBTRACTION

    @Test
    public void testSubtractionNo0() {

        Integer result = calculatorService.subtract(2, 3);

        assertEquals(-1, result);
    }

    @Test
    public void testSubtractionNo1() {

        Double result = calculatorService.subtract(4.5, 3.0);

        assertEquals(4.5, result);
    }

    //  MULTIPLICATION

    @Test
    public void testMultiplicationNo0() {
        Integer result = calculatorService.multiple(2, 3);

        assertEquals(6, result);
    }

    @Test
    public void testMultiplicationNo1() {

        Double result = calculatorService.multiple(2.5, 1.5);

        assertEquals(3.75, result);
    }

    //  DIVISION

    @Test
    public void testDivisionNo0() {

        Double result = calculatorService.divide(5, 2);

        assertEquals(2.5, result);
    }

    @Test
    public void testDivisionNo1() {

        Double result = calculatorService.divide(5.5, 1.1);

        assertEquals(5, result);
    }

    //  CALCULATE PERCENTAGE

    @Test
    public void testCalculatePercentageNo0(){

        Integer result = calculatorService.calculatePercentage(20, 50);

        assertEquals(10, result);
    }
    


}
