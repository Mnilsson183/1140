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

public class FunNums {
    public static void main(String[] arggs){
        Scanner input = new Scanner(System.in);
        System.out.println("Fun with numbers" + '\n');
        
        System.out.print("Enter a single digit number  : ");
        int x = input.nextInt();
        
        int total = (1 * x) + (11 * x) + (111 * x) + (1111 * x);
        System.out.println('\n' + "\nThe sum of the sequence is   : " + total);
    }
}
