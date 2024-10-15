package itm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import itm.oss.Calculator;

@DisplayName("Cal tests for OSS class")
public class CalculatorTests {
    private final Calculator calc = new Calculator();
    @Test
    @DisplayName("Test for add function.")
    void add(){
        assertEquals(10, calc.add(5,5),"Expected value is 10 in add function.");
    }

    
    @Test
    @DisplayName("Testing function isPrime(4).")
    void isfivePrime(){
        assertTrue(calc.isPrime(5), "5 is prime");
    }

    @Test
    @DisplayName("Testing function isPrime.")
    void isfourPrime(){
        assertTrue(calc.isPrime(4), "4 is not prime");
    }
    
}
