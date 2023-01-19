package org.itstep.task06;

import java.util.Arrays;

public class MainString {
    private char[] chars;

    public MainString() {
        chars = new char[0];
    }

    public MainString(CharSequence sequence) {
        this.chars = sequence.toString().toCharArray();
    }

    public MainString(char symbol, int length) {
        this.chars = new char[length];
        Arrays.fill(chars, symbol);
    }

    public int length(){
        return this.chars.length;
    }

    public void clean(){
        chars = new char[0];
    }
    @Override
    public String toString(){
        return new String(this.chars);
    }

    public MainString concat(MainString mainString){
        String newString = this.toString()+mainString.toString();
        return new MainString(newString);
    }

    public int indexOf(int symb){
        for (int i=0; i<this.chars.length; i++){
            if (this.chars[i] == symb) return i;
        }
        return -1;
    }
}
