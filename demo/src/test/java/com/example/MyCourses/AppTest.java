package com.example.MyCourses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testproceedWithCourse(){
        App a = new App();
        boolean expectedResult = a.proceedWithCourse(new JavaCourse());
        assertTrue(expectedResult);

    }
}
