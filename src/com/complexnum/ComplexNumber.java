package com.complexnum;

public class ComplexNumber extends ComplexNumMethods {
    //  real and imaginary parts of the complex number
    private double RE;
    private double IM;

    public double getRE() {
        return RE;
    }

    public double getIM() {
        return IM;
    }

    //  add cn's re and im parts to the re and im parts of the source object
    ComplexNumber sum(ComplexNumber z) {
        this.IM+=z.IM;
        this.RE+=z.RE;
        return this;
    }

    //  this method is rewriting im and re parts of the source object
    //  like result of multiplying of the 2 complex numbers
    ComplexNumber mul(ComplexNumber z) {
        this.RE=this.RE*z.RE-this.IM*z.IM;
        this.IM=this.IM*z.RE+this.RE*z.IM;
        return this;
    }



    ComplexNumber(double RE, double IM) {
        this.RE=RE;
        this.IM=IM;
    }
}
