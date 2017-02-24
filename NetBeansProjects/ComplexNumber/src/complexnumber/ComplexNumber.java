/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

/**
 *
 * @author eloy011
 */
public class ComplexNumber {
    private final double Real;
    private final double Imaginary;

    public ComplexNumber(double re, double imag) {
        Real = re;
        Imaginary = imag;
    }
    
    public double getReal() {
        return Real;
    }

    public double getImaginary() {
        return Imaginary;
    }

    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(getReal() + c.getReal(),
                                getImaginary() + c.getImaginary());
    }

    public ComplexNumber multiply(ComplexNumber c) {
        double re = getReal()*c.getReal() - getImaginary()*c.getImaginary();
        double imag = getImaginary()*c.getReal() +
        getReal()*c.getImaginary();
        return new ComplexNumber(re, imag);
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject instanceof ComplexNumber) {
            ComplexNumber c = (ComplexNumber) anObject;
          return ((c.getReal() == getReal()) && (c.getImaginary() ==
getImaginary()));
        } else
          return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.Real) ^ (Double.doubleToLongBits(this.Real) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.Imaginary) ^ (Double.doubleToLongBits(this.Imaginary) >>> 32));
        return hash;
    }
}
