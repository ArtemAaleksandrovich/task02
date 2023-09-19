package ru.vsu.cs.plotnikov;

import java.util.Scanner;

public class task01 {
    public static double calcV(double v1, double v2) {
        return v1 + v2;
    }

    public static double calcT(double v1, double v2, double t1, double t2) {
        return (v1 * t1 + v2 * t2) / (v1 + v2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объём v1:");
        double v1 = scanner.nextInt();
        System.out.println("Введите объём v2:");
        double v2 = scanner.nextInt();
        System.out.println("Введите температуру t1:");
        double t1 = scanner.nextInt();
        System.out.println("Введите температуру t2:");
        double t2 = scanner.nextInt();
        System.out.print("Общий объём равен ");
        System.out.println(calcV(v1, v2));
        System.out.print("Температура смеси равна ");
        System.out.println(calcT(v1, v2, t1, t2));
    }
}
