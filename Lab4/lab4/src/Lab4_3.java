/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author morgan
 */
import java.util.Scanner;

public class Lab4_3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Sum of digits\n\n");
        
        System.out.printf("Please enter a 5 digit number     : ");
        int value = input.nextInt();
        int num = value;
        
        int d1 = value / 10000;
        value = value - (d1 * 10000);
        int d2 = value / 1000;
        value = value - (d2 * 1000);
        int d3 = value / 100;
        value = value - (d3 * 100);
        int d4 = value / 10;
        value = value - (d4 * 10);
        int d5 = value / 1;
        
        
        int sum = d1 + d2 + d3 + d4 + d5;
        System.out.printf("The sum of the digits in %d is : %d\n", num,  sum);
    }
    
}
