package com.tms.git;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter number");
        // ОПЕРАТОРЫ ВЕТВЛЕНИЯ
        // operator if
        // operator if-else
        // operator else-if
        int variable = myScanner.nextInt();
        //int variable = 10;
        /*if(variable > 10){
            System.out.println("the variable is greater than 10!");
        } else {
            System.out.println("the variable in lower than 10! ");
        }*/

        if(variable > 11 && variable < 15) {
            System.out.println("the variable is greater than 10 and lower than 15!");
        }else if(variable > 16 && variable < 20) {
            System.out.println("the variable is greater than 16 and lower than 20!");
        }else if(variable > 21 && variable < 31){
            System.out.println("the variable is greater than 21 and lower than 30!");
        } else {
            System.out.println("the variable is lower than 10 or greater than 30!");
        }


        // тернарный если используется для присвоения значения ()? :


        // operator switch-case
        switch (variable) {
            case 11: {
                System.out.println("the variable is equal to 11");
                break;
            }
            case 20: {
                System.out.println("the variable is equal to 20");
                break;
            }
            default:
                System.out.println("the variable is not 11 or 20");
                break;
        }

        //switch case преимущества: при большом количестве условий хорошо оптимизирован поиск, он не беребирает условия, а сразу переходит к нужному.
        //switch case недостатки: нельзя использовать long. byte short string int

        //ЦИКЛЫ. ОПЕРАТОРЫ ПОВТОРЕНИЯ

        //for
        for (int i = 0; i < 10; i++) {
            System.out.println("iteration: " + i);
        }

    }
}
