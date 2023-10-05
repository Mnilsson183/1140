import java.util.Scanner;

public class EqTester {  
  public static void main(String[] args) {  
      Scanner input = new Scanner(System.in);
      System.out.printf("Equation Tester\n\n");
      
      System.out.print("Enter the value for the variable a: ");
      int a = input.nextInt();
      System.out.print("Enter the value for the variable b: ");
      int b = input.nextInt();
      System.out.print("Enter the value for the variable c: ");
      int c = input.nextInt();
      
      int p1, p2, p3;
      p1 = ((4 * a - 2) / (a * (b + 1)));
      p2 = (4 * b *(a * c - b));
      p3 = ((2 * a + 3 - b) / (b + c));
      
      int value =  p1 -   p2 + p3; 
      
      System.out.println();
      System.out.println("The value of the expression is    : " + value);
  }  
} 