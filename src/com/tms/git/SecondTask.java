package com.tms.git;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable = scanner.nextInt();
        scanner.close();

        if (variable < 0) {
            System.out.println("Number Fibonacci must be > 0");
            return;
        }

        int i = 0;
        int sum = 0;
        int prevOne = 0;
        int prevSecond = 1;

        while (i < variable) {
            if (i > 1) {
                sum = prevOne + prevSecond;
                System.out.println(sum);
                prevOne = prevSecond;
                prevSecond = sum;
            } else if (i >= 0 || i <= 1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
