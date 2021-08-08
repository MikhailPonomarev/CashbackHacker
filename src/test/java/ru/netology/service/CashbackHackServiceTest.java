package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void over1000() {
        Assert.assertEquals(999, service.remain(1001));
    }

    @Test
    public void below1000() {
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void ifAmountZero() {
        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void ifAmountNegative() {
        Assert.assertEquals(1001, service.remain(-1));
    }

    @Test
    public void buyEquals1000() {
        Assert.assertEquals(0, service.remain(1000));
    }

}