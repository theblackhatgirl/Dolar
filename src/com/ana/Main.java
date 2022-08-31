package com.ana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double price = scanner.nextDouble();
        System.out.println("How many dollars will be bought?");
        double amount = scanner.nextDouble();
        System.out.println("Amount to be paid in reais: "+CurrencyConverter.conversion(amount, price));

    }
}
