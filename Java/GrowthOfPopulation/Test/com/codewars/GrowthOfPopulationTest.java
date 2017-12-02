package com.codewars;

import org.junit.Test;

import static org.junit.Assert.*;


public class GrowthOfPopulationTest {

    @Test
    public void shouldWorkForThisValue() throws Exception{

        assertEquals("After 15 years a town should have a 5 000 inhabitants if at the beginning was 1 500 and every year increase at 5 percent and moreover 100 new inhabitants", 15, GrowthOfPopulation.HowManyYears( 1500, 5, 100, 5000 ) );
        assertEquals("After 10 years a town should have a 2 000 000 inhabitants if at the beginning was 1 500 000 and every year increase at 2.5 percent and moreover 10 000 new inhabitants", 10, GrowthOfPopulation.HowManyYears( 1500000, 2.5, 10000, 2000000 ) );
        assertEquals("After 94 years a town should have a 2 000 000 inhabitants if at the beginning was 1 500 000 and every year increase at 0.5 percent and moreover 1 000 new inhabitants", 94, GrowthOfPopulation.HowManyYears( 1500000, 0.25, 1000, 2000000 ) );
        assertEquals("After 3 years a town should have a 1200 inhabitants if at the beginning was 1 000 and every year increase at 2 percent and moreover 50 new inhabitants", 3, GrowthOfPopulation.HowManyYears( 1000, 2, 50, 1200 ) );

    }

}