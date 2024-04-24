package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private final double a, b, c, expected;
    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, -2, 1, 1},
                {4, -12, 9, 3.0/2},
                {1, -4, 4, 2},
                {9, -30, 25, 5.0/3}
        });
    }
    @Test
    public void testSingleRootCase(){
//        double expectedRoot = getExpectedRoot(a, b, c);


        assertEquals(String.valueOf(expected), quadraticEquation.solve(a, b, c));
    }


}






