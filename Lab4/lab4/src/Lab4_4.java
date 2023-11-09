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
import java.io.File;
public class Lab4_4 {
    public static void main(String[] args) throws Exception {
        File file = new File("Lab4_Data.txt");
        Scanner input = new Scanner(file);
        System.out.printf("File Magic output\n\n");
        
        input.next();
        input.next();
        System.out.println("Line 1 : " + input.next());
        input.nextLine();
        //line 2
        System.out.println("Line 2 : ");
        input.nextLine();
        // line 3
        input.next();
        System.out.println("Line 3 : " + input.next());
        input.next();
        input.next();
        System.out.println("Line 3 : " + input.next());
        
        input.nextLine();
        System.out.println("Line 4 : " + input.next());
        input.next();
        System.out.println("Line 4 : " + input.next());
    
        input.close();
    }
}
