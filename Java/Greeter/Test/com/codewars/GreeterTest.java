package com.codewars;

import org.junit.Test;

import static org.junit.Assert.*;


public class GreeterTest {

    @Test
    public void ShouldWorkForThisExample() throws Exception{

        assertEquals( "Should greet some people normally", "Hello, Jacob!", Greeter.greet("Jacob") );
        assertEquals( "Should greet some people normally", "Hello, Kamil!", Greeter.greet("Kamil") );
        assertEquals( "Should greet some people normally", "Hello, Jane!", Greeter.greet("Jane") );
        assertEquals( "Should greet some people normally", "Hello, my love!", Greeter.greet("Johnny") );

    }

}