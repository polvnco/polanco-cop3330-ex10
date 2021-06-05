/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex10
{
    public static void main( String[] args )
    {
        double taxRate = 0.055;

        System.out.print( "Enter the price of item 1: " );
        Scanner p1 = new Scanner(System.in);
        String pItem1 = p1.nextLine();

        System.out.print( "Enter the quantity of item 1: " );
        Scanner q1 = new Scanner(System.in);
        String qItem1 = q1.nextLine();

        System.out.print( "Enter the price of item 2: " );
        Scanner p2 = new Scanner(System.in);
        String pItem2 = p2.nextLine();

        System.out.print( "Enter the quantity of item 2: " );
        String qItem2 = q1.nextLine();

        System.out.print( "Enter the price of item 3: " );
        String pItem3 = p2.nextLine();

        System.out.print( "Enter the quantity of item 3: " );
        String qItem3 = q1.nextLine();

        int price1 = Integer.parseInt(pItem1);
        int price2 = Integer.parseInt(pItem2);
        int price3 = Integer.parseInt(pItem3);

        int quantity1 = Integer.parseInt(qItem1);
        int quantity2 = Integer.parseInt(qItem2);
        int quantity3 = Integer.parseInt(qItem3);

        price1 *= quantity1;
        price2 *= quantity2;
        price3 *= quantity3;

        double totalPrice = price1 + price2 + price3;
        double total_withTaxRate = taxRate * totalPrice;


        System.out.println("Subtotal: $" + String.format("%.2f", totalPrice));
        System.out.println("Tax: $" + String.format("%.2f", total_withTaxRate));
        System.out.println("Total: $" + String.format("%.2f", total_withTaxRate + totalPrice));


    }
}
