package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if(a == 0){
            throw new IllegalArgumentException();
        }
        String result;
        double d = calculateDiscriminant(a,b,c);
        if(d > 0){
            double x1 = getX1(d,a,b);
            double x2 = getX2(d,a,b);

            result = x1+" "+x2;
        }else if(d == 0){
            result = ""+getX1(d,a,b);
        }else{
            result = "no roots";
        }
        return result;
    }




    double calculateDiscriminant(double a, double b, double c){
        double d;

        d = Math.pow(b,2) - 4*a*c;
        return d;
    }



    static double getX1(double d, double a, double b){
        double x1;
        x1 = ((-1)*b - Math.sqrt(d)) / (2 * a);

        return x1;
    }


    static double getX2(double d, double a, double b){
        double x1;
        x1 = ((-1)*b + Math.sqrt(d)) / (2 * a);

        return x1;
    }

}