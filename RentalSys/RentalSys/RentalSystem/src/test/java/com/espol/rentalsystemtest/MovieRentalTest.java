/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.espol.rentalsystemtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chris
 */
public class MovieRentalTest {
    
    public MovieRentalTest() {
    }

    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        MovieRental instance = new MovieRental(new Movie("Titanic", 0), 2);
        int expResult = 2;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        Movie test = new Movie("Titanic", 0);
        MovieRental instance = new MovieRental(test, 2);
        Movie expResult = test;
        Movie result = instance.getMovie();
        assertEquals(expResult, result);
    }
    
}
