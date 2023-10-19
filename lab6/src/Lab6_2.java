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

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = (int)(Math.random() * 20) + 1;
        int y = (int)(Math.random() * 20) + 1;
        
        char opp;
        // sub by a small num check edge case of random returning index of 6
        int index = (int)(Math.random() * 5);
        
        char[] opps = {'+', '-', '*', '/', '%'};
        opp = opps[index];
        
        System.out.println("Arithmetic Practice Program");
        
        System.out.print("Question :   ");
        System.out.printf("%d %c %d = ", x, opp, y);
        int answer = input.nextInt();
        
        int total = 0;
        
        if(opp == '+'){
            total = x + y;
        } else if(opp == '-'){
            total = x - y;
        }else if(opp == '*'){
            total = x * y;
        }else if(opp == '/'){
            total = x / y;
        } else if(opp == '%'){
            total = x % y;
        } else{
            System.out.println("Fatal error how did we get here");
            return;
        }
        
        if(answer == total){
            System.out.println("Correct");
        } else{
            System.out.println("Incorrect");
        }
    }
}
