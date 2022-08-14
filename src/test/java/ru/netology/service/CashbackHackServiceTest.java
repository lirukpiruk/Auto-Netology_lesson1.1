package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService ();

    @Test
    public void shouldShowIfPurchasedLess1000 () {

        int actual = service.remain(800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowIfPurchasedMore1000 () {

        int actual = service.remain(1700);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotShowIfPurchasedMultiple1000 () {

        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(actual, expected);
    }




}