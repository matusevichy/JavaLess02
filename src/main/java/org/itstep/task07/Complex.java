package org.itstep.task07;

public class Complex {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex() {
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString(){
        if (this.real == 0 && this.imaginary != 0) return this.imaginary + "i";
        else if (this.imaginary == 0) return Double.toString(this.real);
        else if(this.imaginary > 0) return this.real + " + " + this.imaginary + "i";
        else return this.real + " - " + -1*this.imaginary + "i";
    }

    public boolean equals(Complex complex){
        if (this.real == complex.real && this.imaginary == complex.imaginary) return true;
        return false;
    }

    public Complex plus(Complex complex){
        return new Complex(this.real+complex.real, this.imaginary+complex.imaginary);
    }

    public Complex minus(Complex complex){
        return new Complex(this.real-complex.real, this.imaginary-complex.imaginary);
    }

    public Complex times(Complex complex){
        return new Complex(this.real*complex.real - this.imaginary*complex.imaginary, this.imaginary*complex.real + this.real*complex.imaginary);
    }
}
