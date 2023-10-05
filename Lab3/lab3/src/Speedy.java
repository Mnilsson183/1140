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

public class Speedy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Bike computer helper\n\n");
        
        
        System.out.print("Enter the number of meters travelled   : ");
        float distance = input.nextInt();
        System.out.print("Enter the number of hours you took     : ");
        float hours = input.nextInt();
        System.out.print("Enter the number of minutes you took   : ");
        float minutes = input.nextInt();
        System.out.print("Enter the number of seconds you took   : ");
        float seconds = input.nextInt();
        
        float time = (hours * 60 * 60) + (minutes * 60) + seconds;
        float speed = distance / time;
 
        
        System.out.printf("Your average speed was                 : %.2fkm/s\n", speed);
    }
}
/*
25000
1
12
48
*/