package com.codewars;

/*

    Write function bmi that calculates body mass index (bmi = weight / height ^ 2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"


 */

// This exercise from https://www.codewars.com/kata/calculate-bmi


public class BMI {

    public static String bmi( double weigh, double height ){

        double bmi = weigh / Math.pow( height, 2 );

        if ( bmi <= 18.5 ) return "Underweight";

        else if ( bmi <= 25.0 ) return "Normal";

        else if ( bmi <= 30.0 ) return "Overweight";

        else return "Obese";

    }

}
