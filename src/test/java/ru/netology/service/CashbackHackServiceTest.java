package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void over1000() {
        assertEquals(service.remain(1001),999);
    }

    @Test
    public void below1000() {
        assertEquals(service.remain(999),1);
    }

    @Test
    public void ifAmountZero() {
        assertEquals(service.remain(0),1000);
    }

    @Test
    public void ifAmountNegative() {
        assertEquals(service.remain(-1),1001);
    }

    @Test
    public void buyEquals1000() {
        assertEquals(service.remain(1000), 0);
    }
}