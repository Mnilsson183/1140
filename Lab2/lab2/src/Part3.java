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
public class Part3 {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Multiplication Table");
        System.out.print("Enter a number less than 10: ");
        num = input.nextInt();
        System.out.println();
        System.out.println("     1    2    3    4");
        System.out.println(num + "    " + num * 1 + "   " + num * 2 + "   " + num * 3 + "   " + num * 4 + "    ");
    
        input.close();
    }
}
