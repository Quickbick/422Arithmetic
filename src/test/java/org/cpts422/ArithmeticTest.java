package org.cpts422;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArithmeticTest {
    @Test
    void sumInt1Low (){
        int[] input = {1,149};
        int expected = 150;
        assertEquals(expected,Arithmetic.sum(input[0], input[1]));
    }

    @Test
    void sumInt1High (){
        int[] input = {200,98};
        int expected = 298;
        assertEquals(expected,Arithmetic.sum(input[0], input[1]));
    }

    @Test
    void sumInt2Low (){
        int[] input = {102, 1};
        int expected = 103;
        assertEquals(expected,Arithmetic.sum(input[0], input[1]));
    }

    @Test
    void sumInt2High (){
        int[] input = {137,200};
        int expected = 337;
        assertEquals(expected,Arithmetic.sum(input[0], input[1]));
    }

    @Test
    void diffInt1Low (){
        int[] input = {1,97};
        int expected = -96;
        assertEquals(expected,Arithmetic.difference(input[0], input[1]));
    }

    @Test
    void diffInt1High (){
        int[] input = {200,86};
        int expected = 114;
        assertEquals(expected,Arithmetic.difference(input[0], input[1]));
    }

    @Test
    void diffInt2Low (){
        int[] input = {123, 1};
        int expected = 122;
        assertEquals(expected,Arithmetic.difference(input[0], input[1]));
    }

    @Test
    void diffInt2High (){
        int[] input = {72,200};
        int expected = -128;
        assertEquals(expected,Arithmetic.difference(input[0], input[1]));
    }

}