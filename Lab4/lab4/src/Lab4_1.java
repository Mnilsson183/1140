/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author morgan
 */
import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Seconds Computation Program\n\n");
        
        System.out.print("How many WEEKS  : ");
        int weeks = input.nextInt();
        
        System.out.print("How many DAYS   : ");
        int days = input.nextInt();
        
        
        System.out.print("How many HOURS  : ");
        int hours = input.nextInt();
        
        System.out.print("How many MINUTES: ");
        int minutes = input.nextInt();
        
        System.out.print("How many SECONDS: ");
        int seconds = input.nextInt();
        
        int sumSeconds = seconds + (minutes * 60) + (hours * 60 * 60) +
                            (days * 60 * 60 * 24) + (weeks * 60 * 60 * 24 * 7);
        
        System.out.printf("\nTotal SECONDS during that time period is : %d\n", sumSeconds);
        
        
        
    }
}
