import java.util.Scanner;

public class Lab8_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Harmonic numbers\n");
        System.out.printf("Enter the harmonic number that you wish computed :");
        int index = input.nextInt();

        double prev_har = 0;
        double harmonicVal;
        for(int i = 1; i <= index; i++){
            System.out.printf("K = %d  ", i);
            double inv = 1f/i;
            System.out.printf("term = %f  ", inv);
            harmonicVal = prev_har + 1f/i;
            System.out.printf("Harmonic value = %f\n", harmonicVal);
            prev_har = harmonicVal;
        }
    }
}
