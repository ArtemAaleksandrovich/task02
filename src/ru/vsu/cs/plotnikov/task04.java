package ru.vsu.cs.plotnikov;

import java.util.Scanner;

public class task04 {
    public static void Y1(double x, double y) {
        int b = 2;
        int d = 1;
        for (int i = 0; i < 32; i++) {
            if (x-d == 0){
                System.out.println("Знаменатель равен 0, делить на 0 нельзя");
                break;
            }
            else {
                y *= (x - b) / (x - d);
                b += 2;
                d += 2;
            }
        }
        if (x-d != 0) {
            System.out.println(y);
        }
    }

    public static double Y2(double x1, double a, double f) {
        for (int i = 0; i < 5; i++) {
            f *= x1;
            f -= a;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x для решения первой функции:");
        double x = scan.nextDouble();
        System.out.println("Введите x для решения второй функции:");
        double x1 = scan.nextDouble();
        System.out.println("Введите a для решения второй функции:");
        double a = scan.nextDouble();
        double f = (x1 - a);
        double y = 1;
        System.out.print("Ответ на первую функцию: ");
        Y1(x, y);
        System.out.print("Ответ на вторую функцию: ");
        System.out.println(Y2(x1, a, f));

    }
}


