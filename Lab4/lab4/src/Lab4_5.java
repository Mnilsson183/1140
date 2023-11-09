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
public class Lab4_5 {
    public static void main(String[] args) throws Exception {
        File file = new File("SecretMsg.txt");
        Scanner input = new Scanner(file);
        
        String out = "";
        
        System.out.println("File Magic output");
        //first line
        input.next();
        input.next();
        input.next();
        out = out + input.next() + ' ';
        
        input.nextLine();
        // 2 line
        input.next();
        String tmp = "";
        tmp = tmp + input.next().toUpperCase().charAt(0);
        tmp = tmp + input.next().toUpperCase().charAt(0);
        tmp = tmp + input.next().toUpperCase().charAt(0);
        out = out + tmp + ' ';
        
        input.nextLine();
        // 3 line
        input.next();
        out = out + input.next();
        // 4 line
        input.nextLine();
        out = out + input.nextLine().substring(8,12);
        
        // 5 line
        input.next();
        input.next();
        input.next();
        input.next();
        input.next();
        input.next();
        out = out + ' ' + input.next().substring(0, 4);
        input.next();
        out = out + ' ' + input.next().length();
        out = out + ' ' + input.next().substring(3, 5);
        
        input.nextLine();
        // line 6
        input.next();
        input.next();
        out = out + ' ' + input.next() + ':';
        input.nextLine();
        out = out + input.nextLine().length();
        // line 7
        
        System.out.println(out);
        
        input.close();
    }
}
