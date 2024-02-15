package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // object will not be created for each tests
public class ShapesTest {
    public ShapesTest(){
        System.out.println("Instance is created before tests");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all  test cases executes only once");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all  test cases executes only once");
    }
    Shapes s;

    @BeforeEach
    public void init(){
        s = new Shapes();
        System.out.println("Before each method");
    }
    
    @Test
    public void testareaOfCircle(){
        // Shapes s = new Shapes();
        assertEquals(153.86, s.areaOfCircle(7));
    }

    @Test
    public void testareaOfSquare(){
        // Shapes s = new Shapes();
        assertEquals(49, s.areaOfSquare(7));
    }

    @AfterEach
    public void destroy(){
        System.out.println("After each");
    }
}

/*
Outout of above 
Before all  test casesexecutes only once
Instance is created before tests
Before each method
Inside area of circle
After each
Instance is created before tests
Before each method
Inside area of square
After each
After all  test cases executes only once
 */