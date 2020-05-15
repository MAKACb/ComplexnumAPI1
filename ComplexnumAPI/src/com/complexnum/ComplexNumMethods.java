package com.complexnum;

public abstract class ComplexNumMethods {
    //MOD method returns module of the complex number and calls like x.MOD(ComplexNum s)
    //or for x like a x.MOD(x) and can be use for example ''double a=x.MOD(x);''
    public double MOD(ComplexNumber z)
    {
        return Math.pow(Math.pow(z.getIM(),2)+Math.pow(z.getRE(),2),0.5);
    }

    //it is an ariphmethic form translator that can be print in string format
    //and also can be saved in string type operand like
    //String St=x.AFORMPRINT(ComplexNum x); (or something ComplexNum type)
    //where x is a initialised ComplexNum object
    public static String AFORMPRINT(ComplexNumber z)
    {
        String S;
        S=(z.getRE()+"+i"+z.getIM());
        return S;
    }

    //
    public static ComplexNumber AFORMSCAN(String S)
    {
        ComplexNumber z = new ComplexNumber(0,0);
        ////////////////////////-------
        return z;
    }

    //it is an exponential form printing method of the complex numbers that return
    //String data about our complex number that is an initialised ComplexNum type object
    public String EFORMPRINT (ComplexNumber z)
    {
        String S;
        S=(z.MOD(z)+"e^i"+Math.atan(z.getIM()/z.getRE())/Math.PI*180); //e^(i*DEG)
        return S;
    }

    //it is a method that can sum 2 complex numbers which was initialised like
    //ComplexNum objects in 1 ComplexNum object
    //it can be used like Z=Z.SUM(Z1,Z2);
    //(if we have a Z,Z1,Z2 initialised objects ComplexNum type)
    public ComplexNumber SUM(ComplexNumber z1,ComplexNumber z2)
    {
        ComplexNumber z=new ComplexNumber(z1.getRE()+z2.getRE(),z1.getIM()+z2.getIM());
        return z;
    }

    //this method multiplying 2 ComplexNum complex numbers and return ComplexNum type
    public ComplexNumber MUL(ComplexNumber z1, ComplexNumber z2)
    {
        ComplexNumber z=new ComplexNumber(z1.getRE()*z2.getIM()-z1.getIM()*z2.getIM(),z1.getIM()*z2.getRE()+z1.getRE()*z2.getIM());
        return z;
    }

    //this method deviding 2 ComplexNum complex numbers first on second
    //and return ComplexNum type value
    public ComplexNumber DEV(ComplexNumber z1, ComplexNumber z2)
    {
        ComplexNumber z=new ComplexNumber(
                (z1.getRE()*z2.getRE()+z1.getIM()*z2.getIM())/
                        (z2.getRE()*z2.getRE()+z2.getIM()*z2.getIM()),
                (z1.getIM()*z2.getRE()-z1.getRE()*z2.getIM())/
                        (z2.getRE()*z2.getRE()+z2.getIM()*z2.getIM())
        );
        return z;
    }

}
