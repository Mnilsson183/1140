/**
 * @author 5004993 Morgan Nilsson
 */
import java.util.Scanner;

public class Hello4 {

    public static void main(String argv[]) {
        Scanner input = new Scanner(System.in);

        // init variables that will be written to
        int length = 0;
        int width = 0;

        // Print boilerplate 
        System.out.println("This program will compute the area and perimeter of rectangles");
        System.out.println();
        
        // ask for the users width
        System.out.print("Please enter the rectangle width   : ");
        width = input.nextInt();

        // ask for the users length
        System.out.print("Please enter the rectangle length  : ");
        length = input.nextInt();

        // print a seperating line between the inputs and outs
        System.out.println();

        // print the area
        int area = length * width;
        System.out.println("The area of your rectangle is      : " + area);

        // print the perimeter
        int perim = (2 * length) + (2 * width);
        System.out.println("The perimeter of your rectangle is : " + perim);
        input.close();
    }
}
