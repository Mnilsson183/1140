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

public class Lab5_1 {
    public static void main(String[] args) throws Exception{
        File file = new File("PaycheckData2.txt");
        Scanner input = new Scanner(file);
        
        String firstName = input.next();
        String lastName = input.next();
        int employeeNumber = input.nextInt();
        
        double payRate = input.nextDouble();
        
        System.out.printf("Employee First Name    : %s\n", firstName);
        System.out.printf("Employee Last Name     : %s\n", lastName);
        System.out.printf("Employee Number        : %d\n", employeeNumber);
        System.out.printf("Hourly wage            : %.2f\n\n", payRate);
        
        double mondayHours = input.nextDouble();
        double tuesdayHours = input.nextDouble();
        double wednesdayHours = input.nextDouble();
        double thursdayHours = input.nextDouble();
        double fridayHours = input.nextDouble();
        double saturdayHours = input.nextDouble();
        double sundayHours = input.nextDouble();
        
        System.out.printf("Hours worked on Monday    :    %5.1f\n", mondayHours);
        System.out.printf("Hours worked on Tuesday   :    %5.1f\n", tuesdayHours);
        System.out.printf("Hours worked on Wednesday :    %5.1f\n", wednesdayHours);
        System.out.printf("Hours worked on Thursday  :    %5.1f\n", thursdayHours);
        System.out.printf("Hours worked on Friday    :    %5.1f\n", fridayHours);
        System.out.printf("Hours worked on Saturday  :    %5.1f\n", saturdayHours);
        System.out.printf("Hours worked on Sunday    :    %5.1f\n\n", sundayHours);
        
        double mondayEarning = mondayHours * payRate;
        double tuesdayEarning = tuesdayHours * payRate ;
        double wednesdayEarning = wednesdayHours * payRate;
        double thursdayEarning = thursdayHours * payRate;
        double fridayEarning = fridayHours * payRate;
        double saturdayEarning = saturdayHours * payRate;
        double sundayEarning = sundayHours * payRate;
        
        System.out.printf("Monday     earnings       :$   %7.2f\n", mondayEarning);
        System.out.printf("Tuesday    earnings       :$   %7.2f\n", tuesdayEarning);
        System.out.printf("Wednesday  earnings       :$   %7.2f\n", wednesdayEarning);
        System.out.printf("Thursday   earnings       :$   %7.2f\n", thursdayEarning);
        System.out.printf("Friday     earnings       :$   %7.2f\n", fridayEarning);
        System.out.printf("Saturday   earnings       :$   %7.2f\n", saturdayEarning);
        System.out.printf("Sunday     earnings       :$   %7.2f\n", sundayEarning);
    }
}
