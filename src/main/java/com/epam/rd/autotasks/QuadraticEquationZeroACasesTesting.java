package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;


@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private final double a, b, c;
    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0, 1, 2},
                {0, 3, 5},
                {0, 4, 1},
                {0, 0, 0}
        });
    }

    @Test
    public void testNullCase(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->quadraticEquation.solve(a,b,c));
    }


}
