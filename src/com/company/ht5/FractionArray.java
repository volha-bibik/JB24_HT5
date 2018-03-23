package com.company.ht5;

import java.util.Scanner;

public class FractionArray {
    private static int getNumber(String askData) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + askData + ":");
        while(!sc.hasNextInt()) {
            sc.next();
        }
        int result = sc.nextInt();
        if (result == 0) {
            System.out.println("It's can't be zero!");
            result = getNumber(askData);
        }
        return result;
    }

    private static void initializeArray(int k, Fraction[] mas) {
        for (int i = 0; i < k; i++) {
            mas[i] = new Fraction();
            mas[i].setMN(getNumber("numerator"), getNumber("denominator"));
//            mas[i].setMN();
        }
    }

    private static void printArray(Fraction[] mas) {
        System.out.println("Array: ");
        for (Fraction item: mas) {
            System.out.println(item.getM() + " / " + item.getN());
        }
    }

    public static void main(String[] args) {
        int k = getNumber("array size");
        Fraction[] fractions = new Fraction[k];
        initializeArray(k, fractions);
        printArray(fractions);
    }
}
