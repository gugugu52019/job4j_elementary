package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void exist() {
        double ab = 3.0;
        double ac = 2.0;
        double bc = 12.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
        Assert.assertFalse(result);
    }
}