package ru.vsu.cs.plotnikov;

public class Main {
    public static double calcHypot (int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {

        System.out.println(calcHypot(3,4));
    }
}

