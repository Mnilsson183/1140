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

public class PayCheck {

    
    public static void main(String[] args) throws Exception {
        File payCheckData = new File("PaycheckData.txt");

        Scanner payData = new Scanner(payCheckData);  
        System.out.printf("Employee Paystub\n\n");

        float hourly = payData.nextFloat();
        System.out.println("Hourly wage               : " + hourly +'\n');
        
        float monday = payData.nextFloat();
        float tuesday = payData.nextFloat();
        float wednesday = payData.nextFloat();
        float thursday = payData.nextFloat();
        float friday = payData.nextFloat();
        float saturday = payData.nextFloat();
        float sunday = payData.nextFloat();
        System.out.printf("Hours worked on Monday    : %.2f\n", monday);
        System.out.printf("Hours worked on Tuesday   : %.2f\n", tuesday);
        System.out.printf("Hours worked on Wednesday : %.2f\n", wednesday);
        System.out.printf("Hours worked on Thursday  : %.2f\n", thursday);
        System.out.printf("Hours worked on Friday    : %.2f\n", friday);
        System.out.printf("Hours worked on Saturday  : %.2f\n", saturday);
        System.out.printf("Hours worked on Sunday    : %.2f\n\n", sunday);
        
        float total = monday + tuesday + wednesday + thursday + friday + saturday + sunday;
        System.out.printf("Total Hours worked        : %.2f\n\n", total);
        
        System.out.printf("Monday    earnings        : $%.2f\n", (monday * hourly));
        System.out.printf("Tuesday   earnings        : $%.2f\n", (tuesday * hourly));
        System.out.printf("Wednesday earnings        : $%.2f\n", (wednesday * hourly));
        System.out.printf("Thursday  earnings        : $%.2f\n", (thursday * hourly));
        System.out.printf("Friday    earnings        : $%.2f\n", (friday * hourly));
        System.out.printf("Saturday  earnings        : $%.2f\n", (saturday * hourly));
        System.out.printf("Sunday   earnings         : $%.2f\n\n", (sunday * hourly));
        
        float weekdayPay = hourly * (total - saturday - sunday);
        float weekday = total - saturday - sunday;
        float weekendPay = hourly * (total - weekday);
        
        System.out.printf("Weekday earnings          : $%.2f\n", weekdayPay);
        System.out.printf("Weekend earnings          : $%.2f\n\n", weekendPay);
        
        System.out.printf("Total Salary              : $%.2f\n", (hourly * total));
    
        payData.close();
    }
    
}
