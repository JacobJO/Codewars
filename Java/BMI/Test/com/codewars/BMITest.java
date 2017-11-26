package com.codewars;

import org.junit.Test;

import static org.junit.Assert.*;


public class BMITest {

    @Test
    public void ShouldWorkForThisValue() throws Exception{

        assertEquals( "If you weight 60kg and you have 2m you should be underweight", "Underweight", BMI.bmi( 60, 2 ) );
        assertEquals( "If you weight 79kg and you have 1,8m you should be normal", "Normal", BMI.bmi( 79, 1.8 ) );
        assertEquals( "If you weight 82kg and you have 1,8m you should be overweight", "Overweight", BMI.bmi( 82, 1.8 ) );
        assertEquals( "If you weight 120kg and you have 1,85m you should be obese", "Obese", BMI.bmi( 120, 1.85 ) );

    }

}