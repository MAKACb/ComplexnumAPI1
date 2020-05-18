package com.complexnum;

abstract class Cplx {
    //MOD method returns module of the complex number and calls like Cplx.MOD(ComplexNum s)
    public static double MOD(ComplexNumber z)
    {
        return Math.pow(Math.pow(z.getIM(),2)+Math.pow(z.getRE(),2),0.5);
    }

    //it is an ariphmethic form translator that can be print in string format
    //and also can be saved in string type operand like
    //String St=Cplx.AFORMPRINT(ComplexNum x); (or something ComplexNum type)
    //where x is an initialised ComplexNum object
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
    //String format
    public static String EFORMPRINT (ComplexNumber z)
    {
        String S;
        S=(Cplx.MOD(z)+"e^i"+Math.atan(z.getIM()/z.getRE())/Math.PI*180); //e^(i*DEG)
        return S;
    }

    //it is a method that can sum 2 complex numbers which was initialised like
    //ComplexNum objects in 1 ComplexNum object
    //it can be used like Z=Cplx.SUM(Z1,Z2);
    //(if we have a Z,Z1,Z2 initialised objects ComplexNum type)
    public static ComplexNumber SUM(ComplexNumber z1,ComplexNumber z2)
    {
        ComplexNumber z=new ComplexNumber(z1.getRE()+z2.getRE(),z1.getIM()+z2.getIM());
        return z;
    }

    //this method multiplying 2 ComplexNumber complex numbers and return ComplexNumber type
    public static ComplexNumber MUL(ComplexNumber z1, ComplexNumber z2)
    {
        ComplexNumber z=new ComplexNumber(z1.getRE()*z2.getIM()-z1.getIM()*z2.getIM(),
                z1.getIM()*z2.getRE()+z1.getRE()*z2.getIM());
        return z;
    }

    //this method deviding 2 ComplexNumber complex numbers first on second
    //and return ComplexNumber type value
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
