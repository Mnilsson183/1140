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

public class Lab6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Integer Math Calculator Program\n");
        
        System.out.printf("+    Addition\n-    Subtraction\n*    Multiplication\n/    Division\n");
        System.out.println("%    Remainder");
        
        System.out.printf("Which operation do you wish : ");
        char opp = input.next().charAt(0);
        
        System.out.printf("Enter Value for X : ");
        int x = input.nextInt();
        System.out.printf("Enter Value for Y : ");
        int y = input.nextInt();
        
        int total;
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
            System.out.println("Unfortunatly the opperator that you gave is not valid");
            input.close();
            return;
        }
        
        System.out.printf("%d %c %d = %d\n", x , opp, y, total);
    
        input.close();
    }
}
