/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the principal amount?");
        int principal = Integer.parseInt(input.nextLine());

        System.out.println("What is the rate?");
        double rate = Double.parseDouble(input.nextLine());

        System.out.println("What is the number of years?");
        int years = Integer.parseInt(input.nextLine());

        System.out.println("What is the number of times the interest is compounded per year?");
        int times = Integer.parseInt(input.nextLine());

        double amount = principal*Math.pow((1 + ((rate/100)/times)), (times*years));

        System.out.format("%d invested at %.1f%% for %d years compounded %d times per year is $%.2f", principal, rate, years, times, amount);
    }
}