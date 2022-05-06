package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax10To53Then53() {
        int left = 10;
        int right = 53;
        int result = Max.max(left, right);
        int expected = 53;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax30To15Then30() {
        int left = 30;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax20To20Then20() {
        int left = 20;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }
}