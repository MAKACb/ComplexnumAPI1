package com.complexnum;

public class ForTest {
    public static void main(String[] args) {
        ComplexNumber z1=new ComplexNumber(3.,4.);
        z1.sum(new ComplexNumber(1.,2.));
        System.out.println(z1.AFORMPRINT(z1));
    }
}
