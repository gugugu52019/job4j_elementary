package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManHeight180ThenWeight100point05() {
        short height = 187;
        double expected = 100.05f;
        double out = Fit.manWeight(height);
        double eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenWomanHeight180ThenWeight88point55() {
        short height = 187;
        double expected = 88.55f;
        double out = Fit.womanWeight(height);
        double eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }
}