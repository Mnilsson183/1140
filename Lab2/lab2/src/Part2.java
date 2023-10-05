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
public class Part2 {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.println("Simple arithmetic");
        System.out.println();
        
        System.out.print("Enter a number for the variable x : ");
        int x = input.nextInt();
        
        System.out.print("Enter a number for the variable y : ");
        int y = input.nextInt();
        
        System.out.println();
        
        System.out.println("X + Y = " + (x + y));
        
        System.out.println("X - Y = " + (x - y));
        
        System.out.println("X * Y = " + (x * y));
        
        System.out.println("X / Y = " + (x / y));
        
    }
}
