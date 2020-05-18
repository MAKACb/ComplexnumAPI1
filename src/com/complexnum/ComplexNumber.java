package com.complexnum;

public class ComplexNumber {
    //  real and imaginary parts of the complex number
    private double RE;
    private double IM;

    public double getRE() {
        return RE;
    }

    public double getIM() {
        return IM;
    }


    ComplexNumber(double RE, double IM) {
        this.RE=RE;
        this.IM=IM;
    }
}
