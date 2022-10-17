package com.tms.git;

import java.util.Scanner;

public class CycleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable = scanner.nextInt();

        /*for (int i = 0; i - 3 < variable % 2; i+=2) {
            System.out.println("Iteration number: " + i);
        }*/

        for (int i = 0; i  < variable; i++) {
            if(i % 2 == 0){
                System.out.println("Iteration number: " + i);
            }
        }

        // OPERATOR WHILE
        /*int i = 0;
        while(i < variable) {
            System.out.println("Iteration number: " + i);
            i++;
        }*/

        //OPERATOR DO-WHILE
        int i = 0;
        do {
            System.out.println("Iteration number: " + i);
            i++;
        } while (i < variable);

        // ОПЕРАТОРЫ ПЕРЕХОДА BREAK, CONTINUE, RETURN

    }
}
