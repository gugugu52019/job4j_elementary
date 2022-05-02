package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX1r0X2r2Y1r0Y2r0ThenDistance2() {
        double expected = 2;
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX1r2X2r2Y1r3Y2r4ThenDistance1() {
        double expected = 1;
        int x1 = 2;
        int x2 = 2;
        int y1 = 3;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX1r8X2r7Y1r9Y2r2ThenDistance7point07() {
        double expected = 7.07f;
        int x1 = 8;
        int x2 = 7;
        int y1 = 9;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}