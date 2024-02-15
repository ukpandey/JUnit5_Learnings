package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

public class App2Test {
    
    @Test
    public void testSum(){
        App2 a2 = new App2();
        int expected = a2.sum(4,5);
        assertEquals(expected,9,"sum was supposed to be 9");
        assertNotEquals(expected, 10);
        Supplier<String> s = new Supplier<String>() {
            public String get(){
                return "This is error message if test case falils";
            }
        };

        Supplier<String> s2 = ()-> "This is error message if test case fails";
        assertEquals(9,a2.sum(5, 5),s2);
        assertEquals(9,a2.sum(5, 4), () -> "Error message for developer");
    }
}

