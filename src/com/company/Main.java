package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Факториал");
        factorial();
    }
    public static void factorial() {
        int factor = 1;
        int number = 10;
        for (int i = 1; i <= number; i++) {
            factor = factor * i;
            System.out.println(factor);
        }
    }
}