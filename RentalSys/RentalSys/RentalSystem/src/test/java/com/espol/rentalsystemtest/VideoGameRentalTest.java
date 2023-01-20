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
public class VideoGameRentalTest {
    
    public VideoGameRentalTest() {
    }

    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        Object test = new Ps3Game("GOW");
        VideoGameRental instance = new VideoGameRental(test, 2, true);
        int expResult = 2;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        Object test = new Ps3Game("GOW");
        VideoGameRental instance = new VideoGameRental(test, 2, true);
        Object expResult = test;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result); 
    }

    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        Object test = new Ps3Game("GOW");
        VideoGameRental instance = new VideoGameRental(test, 2, true);
        double expResult = 35.989999999999995;
        double result = instance.getCharge();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        Object test = new Ps3Game("GOW");
        VideoGameRental instance = new VideoGameRental(test, 2, true);
        int expResult = 2;
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
    }
    
}
