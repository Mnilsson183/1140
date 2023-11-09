
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5004993
 */
public class Labb6_3 {
    public static void main(String[] args) throws Exception{
        File file = new File("PaycheckData3.txt");
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
        
        double mondayOver = 0;
        double tuesdayOver = 0;
        double wednesdayOver = 0;
        double thursdayOver = 0;
        double fridayOver = 0;
        double saturdayOver = 0;
        double sundayOver = 0;
        
        double mondayReg = 0;
        double tuesdayReg = 0;
        double wednesdayReg = 0;
        double thursdayReg = 0;
        double fridayReg = 0;
        double saturdayReg = 0;
        double sundayReg = 0;
        
        if(mondayHours > 8){
            mondayOver = (mondayHours - 8) * payRate * 1.5;
            mondayReg = (8 * payRate);
        } else{
            mondayReg = mondayHours * payRate;
        }
        
        if(tuesdayHours > 8){
            tuesdayOver = (tuesdayHours - 8) * payRate * 1.5;
            tuesdayReg = (8 * payRate);
        } else{
            tuesdayReg = tuesdayHours * payRate;
        }
        
        if(wednesdayHours > 8){
            wednesdayOver = (wednesdayHours - 8) * payRate * 1.5;
            wednesdayReg = (8 * payRate);
        } else{
            wednesdayReg = wednesdayHours * payRate;
        }
        
        if(thursdayHours > 8){
            thursdayOver = (thursdayHours - 8) * payRate * 1.5;
            thursdayReg = (8 * payRate);
        } else{
            thursdayReg = thursdayHours * payRate;
        }
        
        if(fridayHours > 8){
            fridayOver = (fridayHours - 8) * payRate * 1.5;
            fridayReg = (8 * payRate);
        } else{
            fridayReg = fridayHours * payRate;
        }
        
        if(saturdayHours > 8){
            saturdayOver = (saturdayHours - 8) * payRate * 2;
            saturdayReg = (8 * payRate);
        } else{
            saturdayReg = saturdayHours * payRate;
        }
        
        if(sundayHours > 8){
            sundayOver = (sundayHours - 8) * payRate * 2;
            sundayReg = (8 * payRate);
        } else{
            sundayReg = sundayHours * payRate;
        }
        
        double mondayEarning = mondayOver + mondayReg;
        double tuesdayEarning = tuesdayOver + tuesdayReg;
        double wednesdayEarning = wednesdayOver + wednesdayReg;
        double thursdayEarning = thursdayOver + thursdayReg;
        double fridayEarning = fridayOver + fridayReg;
        double saturdayEarning = saturdayOver + saturdayReg;
        double sundayEarning = sundayOver + sundayReg;
     
        
        System.out.printf("Monday     earnings       :$ %7.2f\n", mondayEarning);
        System.out.printf("Tuesday    earnings       :$ %7.2f\n", tuesdayEarning);
        System.out.printf("Wednesday  earnings       :$ %7.2f\n", wednesdayEarning);
        System.out.printf("Thursday   earnings       :$ %7.2f\n", thursdayEarning);
        System.out.printf("Friday     earnings       :$ %7.2f\n", fridayEarning);
        System.out.printf("Saturday   earnings       :$ %7.2f\n", saturdayEarning);
        System.out.printf("Sunday     earnings       :$ %7.2f\n\n", sundayEarning);
        
        double workDayReg = mondayReg + tuesdayReg + wednesdayReg 
                + thursdayReg + fridayReg;
        
        double workDayOver = mondayOver + tuesdayOver + wednesdayOver 
                + thursdayOver + fridayOver;
        
        double weekendDayReg = saturdayReg + sundayReg;
        double weekendDayOver = saturdayOver + sundayOver;
        
        System.out.printf("Weekday regular earnings  :$ %7.2f\n", workDayReg);
        System.out.printf("Weekday overtime earnings :$ %7.2f\n", workDayOver);
        System.out.printf("Weekend regular earnings  :$ %7.2f\n", weekendDayReg);
        System.out.printf("Weekend overtime earnings :$ %7.2f\n\n", weekendDayOver);
        
        double total = workDayOver + weekendDayOver + workDayReg + weekendDayReg;
        
        System.out.printf("Total Salary              :$ %7.2f\n", total);
    
        input.close();
    }
}
