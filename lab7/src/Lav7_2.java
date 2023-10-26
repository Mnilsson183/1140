import java.util.Scanner;

public class Lav7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a numerator : ");
        int numerator = input.nextInt();
        System.out.printf("Enter a denominator : ");
        int denominator = input.nextInt();

        if(numerator < denominator){
            System.out.printf("%d / %d is a proper fraction", numerator, denominator);
        } else if((numerator % denominator) == 0){
            System.out.printf("%d / %d is an improper fraction", numerator, denominator);
            System.out.printf(", and it can be reduced to %d", (numerator / denominator));
        } else {
            System.out.printf("%d / %d is an improper fraction", numerator, denominator);
            int leftovers = numerator % denominator;
            System.out.printf(", and its mixed fraction is %d + %d / %d", (numerator / denominator), leftovers, denominator);
        }
        System.out.printf("\n");
    }
}
