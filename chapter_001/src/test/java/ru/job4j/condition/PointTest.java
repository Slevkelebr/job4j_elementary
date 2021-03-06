package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(1, 2, 4);
        Point b = new Point(1, 2, 3);
        double expected = a.distance3d(b);
        double out = 1.0;
        Assert.assertEquals(expected, out, 0.01);
    }
}
