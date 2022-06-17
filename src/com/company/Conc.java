package com.company;

public class Conc {

    public String concatStr (String a, String b) {
        return a + b;
    }

    static String s1 = "In 2022 I'll be the reach QA";
    static int len1 = s1.length();

    public static int strSize() {
        return len1;
    }

    public static void main (String[]args){
        Conc conc = new Conc();
        conc.concatStr("Привет", " GITHUB");
        System.out.println(conc.concatStr("Привет"," GITHUB"));

        System.out.println(strSize());
    }
}
