package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private final double a, b, c;
    private final String expected;
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1, -5, 6, "2.0 3.0"},
                {1, -6, 5, "1.0 5.0"},
                {2, -7, 3, "0.5 3.0"},
                {3, -10, 3, 1.0/3+" 3.0"}
        });
    }

    @Test
    public void testTwoRootsCase(){
        double delta = 0.001;
        assertEquals(expected, quadraticEquation.solve(a, b, c));
    }







}
