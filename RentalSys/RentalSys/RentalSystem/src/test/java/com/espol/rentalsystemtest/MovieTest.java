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
public class MovieTest {
    
    public MovieTest() {
    }

    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie instance = new Movie("Titanic",0);
        int expResult = 0;
        int result = instance.getPriceCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int arg = 0;
        Movie instance = new Movie("Titanic",0);
        instance.setPriceCode(arg);
    }
    
}
