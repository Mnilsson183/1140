/*
 Hello3-- Demonstrating simple input and arithmetic manipulation of integers 
*/
import java.util.Scanner; 
public class Hello3 {
 public static void main( String args[] ) {
 
 // creates a Scanner object to obtain input from console window
 Scanner input = new Scanner( System.in );
 int a; //reserve space for integers
 int b; 
 int sum, difference, product;
 System.out.println("This is Hello3");
 //get input data from the user
 System.out.print( "Enter a whole number: " ); //prompt user for an action
 a = input.nextInt(); //read what the user enters
 System.out.print( "Enter another number: " ); // prompt user for an action
 b = input.nextInt(); //read what the user enters
 //print out what the user entered
 System.out.println();
 System.out.println( "The first number is : " + a);
 System.out.println( "The second number is: " + b);
 System.out.println();
 
 // compute the sum, difference and product
 sum = a + b;
 difference = a - b; // was the wring type of dash
 product = a * b;
 //print out the results of some simple computations
 
 System.out.println( "Sum of the two numbers is : " + sum);
 System.out.println( "Difference of the two numbers is : " + difference);
 System.out.println( "Product of the two numbers is. : " + product);
 
 input.close();
 } // end method main
} 