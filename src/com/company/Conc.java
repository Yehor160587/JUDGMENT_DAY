package com.company;

public class Conc {
    public String concatStr (String a, String b) {
        return a + b;
    }
    
    public static void main (String[]args){
Conc conc = new Conc();
conc.concatStr("Привет", " GITHUB");
        System.out.println(conc.concatStr("Привет"," GITHUB"));
    }
}
