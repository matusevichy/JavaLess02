package org.itstep.task05;

public class Money {
    private long hryvnia;
    private byte kopecks;

    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }

    public Money() {
    }

    public Money(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public Money(long hryvnia, byte kopecks) {
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }

    public void Show(){
        System.out.println(this.hryvnia + "," + ((this.kopecks < 10)? "0"+this.kopecks:this.kopecks));
    }

    public Money addition(Money money){
        long hryvnia = this.hryvnia + money.hryvnia;
        int kopecks = this.kopecks + money.kopecks;
        if (kopecks >= 100){
            kopecks -=100;
            hryvnia++;
        }
        return new Money(hryvnia, (byte) kopecks);
    }
    public Money subtraction(Money money){
        long hryvnia = this.hryvnia - money.hryvnia;
        int kopecks = this.kopecks - money.kopecks;
        if (kopecks < 0){
            kopecks += 100;
            hryvnia--;
        }
        return new Money(hryvnia, (byte) kopecks);
    }

    public Money division(double div){
        return fromDouble(toDouble(this)/div);
    }

    public Money multiply(double mult){
        return fromDouble(toDouble(this)*mult);
    }

    public boolean equals(Money money){
        if (this.hryvnia == money.hryvnia && this.kopecks == money.kopecks) return true;
        return false;
    }
    private double toDouble(Money money){
        double result = money.hryvnia + (double)money.kopecks/100;
        return result;
    }

    private Money fromDouble(double sum){
        double hryvnia = Math.floor(sum);
        byte kopecks = (byte) Math.round((sum-hryvnia)*100);
        return new Money((long) hryvnia, kopecks);
    }
}
