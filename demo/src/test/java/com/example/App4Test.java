package com.example;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class App4Test {
    
    @Test
    public void test1(){
        App4 a4 = new App4();
        int unsorted[] = {3,1,2};
        assertTimeout(Duration.ofMillis(1), ()->a4.sortingArray(unsorted));
    }
}
