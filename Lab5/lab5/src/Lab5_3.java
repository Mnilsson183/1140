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

public class Lab5_3 {
    public static void main(String[] args) {
        double RADUIS = 6391.2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Start Location");
        System.out.print("Enter latitude        : ");
        double lat1 = input.nextDouble();
        
        System.out.print("Enter Longitude       : ");
        double long1 = input.nextDouble();
        
        System.out.println("\nEnd Location");
        System.out.print("Enter latitude        : ");
        double lat2 = input.nextDouble();
        
        System.out.print("Enter Longitude       : ");
        double long2 = input.nextDouble();
        
        double lat1_rad = Math.toRadians(lat1);
        double long1_rad = Math.toRadians(long1);
        
        double lat2_rad = Math.toRadians(lat2);
        double long2_rad = Math.toRadians(long2);
        
        double x1 = Math.sin(lat1_rad);
        double z1 = Math.cos(lat1_rad);
        
        double x2 = Math.sin(lat2_rad);
        double z2 = Math.cos(lat2_rad);
        
        double x3 = Math.cos(long2_rad - long1_rad);
        
        double a = (x1 * x2) + (z1 * z2 * x3);
        
        double distance = RADUIS * Math.acos(a);
        
        System.out.printf("\nComputed Distance     : %d Km\n", Math.round(distance));
    }
}
