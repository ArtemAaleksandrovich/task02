package ru.vsu.cs.plotnikov;

import java.util.Scanner;

public class task05 {
    public static String Figure(int w) {
        System.out.print("*");
        for (int i = 0; i < w / 2 - 1; i++) {
            System.out.print("-");
        }
        return "*";
    }

    public static void Figure1(int h, int w) {
        for (int i = 0; i < h / 2 - 1; i++) {
            System.out.print("|");
            for (int j = 0; j < w / 2 - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static String Figure2(int w) {
        System.out.print("*");
        for (int i = 0; i < w / 2 - 1; i++) {
            System.out.print("-");
        }
        System.out.print("*");
        for (int i = w / 2; i < w - 2; i++) {
            System.out.print("-");
        }
        return "*";
    }

    public static void Figure3(int h, int w) {
        for (int k = 0; k < h / 2 - 1; k++) {
            for (int j1 = 0; j1 < w / 2; j1++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 1; i++) {
                System.out.print("|");
                for (int j = 0; j < w / 2 - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
    }

    public static void Figure4(int w) {
        for (int i = 0; i < w / 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = w / 2; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.print("*");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        System.out.println(Figure(w));
        Figure1(h, w);
        System.out.println(Figure2(w));
        Figure3(h, w);
        Figure4(w);
    }
}
// for (int j = 0; j < h / 2 - 1; j++) {
//        for (int j1 = w; j1 < w*2-1; j1++){
//        System.out.print(" ");
//        }
//        System.out.println("|");
//        }

//    for (int i1 = 0; i1 < h / 2 - 1; i1++) {
//        for (int j = 0; j < w / 2; j++) {
//        System.out.print(" ");
//        }
//        System.out.println("|");
//        for (int i = 0; i < w - 1; i++) {
//        System.out.print(" ");
//        }
//        System.out.println("|");
//        }