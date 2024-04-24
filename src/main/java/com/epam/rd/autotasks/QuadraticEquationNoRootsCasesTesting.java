package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationNoRootsCasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a;
    private double b;
    private double c;

    // Constructor with parameters
    public QuadraticEquationNoRootsCasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Define the parameters for the test cases
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 0, 1},
                {2, 0, 4},
                {3, 0, 9},
                {2, 3, 5}
        });
    }

    @Test
    public void testNoRootsCase() {
        assertEquals("no roots", quadraticEquation.solve(a, b, c));
    }
}