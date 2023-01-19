package org.itstep.task04;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction addition(Fraction fraction){
        Fraction result = new Fraction();
        int commonDenominator = 0;
        if (this.denominator == fraction.denominator) commonDenominator = this.denominator;
        else commonDenominator = getCommonDenominator(this.denominator, fraction.denominator);
        result.numerator = this.numerator*(commonDenominator/this.denominator) + fraction.numerator*(commonDenominator / fraction.denominator);
        result.denominator = commonDenominator;
        int gcd = getGcd(result.numerator, result.denominator);
        result.numerator /= gcd;
        result.denominator /= gcd;
        return result;
    }

    public Fraction subtraction(Fraction fraction){
        Fraction result = new Fraction();
        int commonDenominator = 0;
        if (this.denominator == fraction.denominator) commonDenominator = this.denominator;
        else commonDenominator = getCommonDenominator(this.denominator, fraction.denominator);
        result.numerator = this.numerator*(commonDenominator/this.denominator) - fraction.numerator*(commonDenominator / fraction.denominator);
        result.denominator = commonDenominator;
        int gcd = getGcd(result.numerator, result.denominator);
        result.numerator /= gcd;
        result.denominator /= gcd;
        return result;
    }

    public Fraction multiplication(Fraction fraction){
        Fraction result = new Fraction();
        result.numerator = this.numerator*fraction.numerator;
        result.denominator = this.denominator*fraction.denominator;
        int gcd = getGcd(result.numerator, result.denominator);
        result.numerator /= gcd;
        result.denominator /= gcd;
        return result;
    }

    public Fraction division(Fraction fraction){
        Fraction result = new Fraction();
        result.numerator = this.numerator*fraction.denominator;
        result.denominator = this.denominator*fraction.numerator;
        int gcd = getGcd(result.numerator, result.denominator);
        result.numerator /= gcd;
        result.denominator /= gcd;
        return result;
    }

    private int getCommonDenominator(int d1, int d2){
        int maxDenominator = (d1 > d2)? d1: d2;
        if (maxDenominator % d1 == 0 && maxDenominator % d2 == 0) return maxDenominator;
        else return d1*d2;
    }

    private int getGcd(int a, int b){
        if(a == b) return a;
        else if(a > b) return b == 0 ? a : getGcd(b, a%b);
        else if(b > a) return a == 0 ? b : getGcd(a, b%a);
        return 1;
    }
}
