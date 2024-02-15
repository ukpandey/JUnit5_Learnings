package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class App3Test {
    
    @Test
    public void testSortingArray(){
        int[] exp = {3,1,2};
        int[] act = {1,2,3};
        App3 a3 = new App3();
        exp = a3.sortingArray(exp);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test2(){
        int[] actual = {1,2,3,4};
        int[] arr = null;
        App3 a3 = new App3();
        // try{
        //     int[] expected = a3.sortingArray(arr);
        // }catch(NullPointerException e){
        //     System.out.println("Exception generated");
        // }

        assertThrows(NullPointerException.class, ()->a3.sortingArray(actual));
        

    }

}
