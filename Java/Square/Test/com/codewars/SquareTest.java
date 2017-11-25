package com.codewars;

import org.junit.Test;

import static org.junit.Assert.*;


public class SquareTest {

    @Test
    public void ShouldWorkForSameExample() throws Exception{

        assertEquals( "negative numbers aren't square numbers", false, Square.isSquare(-4) );
        assertEquals( "5 isn't a square number", false, Square.isSquare(5) );
        assertEquals( "6 isn't a square number", false, Square.isSquare(6) );
        assertEquals( "9 is a square number", true, Square.isSquare(9) );
        assertEquals(  "25 is square number", true, Square.isSquare(25) );

    }

}