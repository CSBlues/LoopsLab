package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

   @Test
   public void testCountFactors9()
   {
     assertEquals(3, Main.countFactors(9));
   }

    @Test
    public void testCountFactors24()
    {
        assertEquals( 8, Main.countFactors(24));
    }

    @Test
    public void testCountFactors5()
    {
        assertEquals( 2, Main.countFactors(5));
    }

    @Test
    public void isPrime9()
    {
        assertTrue(Main.isPrime(9));
    }

    @Test
    public void isPrime5()
    {
        assertFalse(Main.isPrime(5));
    }


}
