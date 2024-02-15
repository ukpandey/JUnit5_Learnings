package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest 
{

    @Test
    void testsumTwoNumbers(){
        App a = new App();
        int actualResult = a.sumTwoNumbers(3,6);
        int expectedResult = 9;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testmultiplyTwoNumbers(){
        App a = new App();
        int actualResult = a.multiplyTwoNumbers(5,5);
        int expectedResult = 25;
        assertEquals(expectedResult, actualResult);
    }
}
