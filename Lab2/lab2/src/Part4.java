/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5004993
 */
import java.util.Scanner;
public class Part4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sales receipt");
        System.out.print("Enter the price of the item: ");
        double price;
        price = input.nextDouble();
        System.out.println();
        System.out.println("    Price : " + String.format("%.2f", price));
        System.out.println("    GST   : " + String.format("%.2f", price * 0.05));
        double total = price * 1.05;
        System.out.println("    Total : " + String.format("%.2f", total));
        System.out.println();
        System.out.print("Enter the amount tendered: ");
        double tendered;
        tendered = input.nextDouble();
        System.out.println();
        System.out.println("Change due:   " + String.format("%.2f", tendered - total));
        System.out.println();
        System.out.println("Thank you and have a nice day!");


        
    }
    
}
