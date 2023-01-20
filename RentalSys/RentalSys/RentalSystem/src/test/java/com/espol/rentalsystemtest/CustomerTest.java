/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.espol.rentalsystemtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author laque
 */
public class CustomerTest {

    @Test
    public void testAddMovieRental() {
        MovieRental arg = new MovieRental(new Movie("One piece film red", 15), 12);
        Customer instance = new Customer("Luis");
        instance.addMovieRental(arg);
    }

    @Test
    public void testAddVideoGameRental() {
        VideoGameRental arg = new VideoGameRental("To leave", 18, true);
        Customer instance = new Customer("Luis");
        instance.addVideoGameRental(arg);
    }

    @Test
    public void testStatement() {
        Customer instance = new Customer("Luis");
        String expResult = "Rental Record for Luis\nAmount owed is 0.0\nYou earned 0 frequent renter points";
        String result = instance.statement();
        assertEquals(expResult, result);
    }
    
}
