package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShowIfPurchasedLess1000() {

        int actual = service.remain(800);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowIfPurchasedMore1000() {

        int actual = service.remain(1700);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotShowIfPurchasedMultiple1000() {

        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(expected, actual);
    }


}