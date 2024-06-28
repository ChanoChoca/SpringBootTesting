package com.chanochoca.tdd;

public class MainApp {
    //atajos con teclado
    //psvm + <Tab>
    //fori + <Tab>
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //System.out.println(i + "," + FizzBuzz.compute(i));
            System.out.println(FizzBuzz.compute(i));
        }
    }
}
