package ru.vsu.cs.plotnikov;

import java.util.Scanner;

public class task02 {
    public static double Xperesech(double A1, double A2, double B1, double B2, double C1, double C2) {
        return (C2 * B1 - C1 * B2) / (A1 * B2 - A2 * B1);
    }

    public static double Yperesech(double A1, double B1, double C1, double x) {
        return (-A1 * x - C1) / B1;
    }

    public static String ProverkaYsl(double A1, double A2, double B1, double B2, double C1, double C2) {
        double delA = A1 / A2;
        double delB = B1 / B2;
        double delC = C1 / C2;
        if (delA != delB) {
            System.out.println("Прямые пересекаются");
            double x = Xperesech(A1, A2, B1, B2, C1, C2);
            double y = Yperesech(A1, B1, C1, x);
            System.out.print("Точка пересечения = ");
            System.out.println("(" + x + ";" + y + ")");
        }
        if (delA == delB) {
            if (delA != delC)
                System.out.println("Прямые параллельны");
            if (delA == delC)
                System.out.println("Прямые совпадают");
        }
        return "^^";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэффициент A1: ");
        double A1 = scanner.nextInt();
        System.out.println("Введите коэффициент B1: ");
        double B1 = scanner.nextInt();
        System.out.println("Введите коэффициент C1: ");
        double C1 = scanner.nextInt();
        System.out.println("Введите коэффициент A2: ");
        double A2 = scanner.nextInt();
        System.out.println("Введите коэффициент B2: ");
        double B2 = scanner.nextInt();
        System.out.println("Введите коэффициент C2: ");
        double C2 = scanner.nextInt();
        System.out.println(ProverkaYsl(A1, A2, B1, B2, C1, C2));
    }
}


