/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author morgan
 */
import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Reverse Seconds Computation Program\n\n");
        System.out.printf("What is the total number of SECONDS: ");
        int inputSeconds = input.nextInt();
        System.out.println();
        
        int leftovers = inputSeconds % (60 * 60 * 24 * 7);
        int weeks = (inputSeconds - leftovers) / (60 * 60 * 24 * 7);
        inputSeconds = leftovers;
        
        leftovers = inputSeconds % (60 * 60 * 24);
        int days = (inputSeconds - leftovers) / (60 * 60 * 24);
        inputSeconds = leftovers;
        
        leftovers = inputSeconds % (60 * 60);
        int hours = (inputSeconds - leftovers) / (60 * 60);
        inputSeconds = leftovers;
        
        leftovers = inputSeconds % (60);
        int minutes = (inputSeconds - leftovers) / (60);
        inputSeconds = leftovers;
        
        int seconds = inputSeconds;
        
        System.out.printf("Number of whole WEEKS   : %3d\n", weeks);
        System.out.printf("Number of whole DAYS    : %3d\n", days);
        System.out.printf("Number of whole HOURS   : %3d\n", hours);
        System.out.printf("Number of whole MINUTES : %3d\n", minutes);
        System.out.printf("Number of       SECONDS : %3d\n", seconds);
    
        input.close();
    }
}
