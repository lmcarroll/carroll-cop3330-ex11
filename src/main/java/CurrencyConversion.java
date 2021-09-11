/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("How many euros are you exchanging?");
        Scanner input = new Scanner(System.in);
        float EuroNum = input.nextFloat();

        System.out.println("What is the exchange rate?");
        input = new Scanner(System.in);
        float ExchangeRate = input.nextFloat();


        float DollarNum = EuroNum * ExchangeRate;

        System.out.printf("%.0f at an exchange rate of %.4f is %.2f U.S. dollars.", EuroNum, ExchangeRate, DollarNum);
    }
}
