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

public class Lab5_2 {
    public static void main(String[] args) {
        System.out.printf("Math Magic Trick\n\n");
        System.out.printf("Abracadabra hocus pocus, I predict that the last step will result in the number 1089.\n\n");
    
       Scanner input = new Scanner(System.in);
        System.out.printf("Enter a 3-digit number in which all digits are decreasing  : ");
        int in = input.nextInt();
        int Permin = in;
        
        int remainder = in % 100;
        int hundreds = (in - remainder) / 100;
        in = in - (100 * hundreds);
        
        remainder = in % 10;
        int tens = (in - remainder) / 10;
        
        int ones = remainder;
        
        int reversed = (ones * 100) + (tens * 10) + hundreds;
        
        
        // ==========================
        in = Permin - reversed;
        
        remainder = in % 100;
        int hundredsDif = (in - remainder) / 100;
        in = remainder;
        
        remainder = in % 10;
        int tensDif = (in - remainder) / 10;
        
        int onesDif = remainder;
        
        int diffReversed = (onesDif * 100) + (tensDif * 10) + hundredsDif;
        
        
        System.out.println("Your number reversed is                                    : " + reversed);
        System.out.println("Your difference is                                         : " + (Permin - reversed));
        System.out.println("The difference reversed is                                 : " + (diffReversed));
        System.out.println("The sum of the two differences is MAGICALLY                : " + (diffReversed + (Permin - reversed)));
    }
}
