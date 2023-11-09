import java.util.Scanner;

public class Lab8_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Harmonic numbers\n");
        System.out.printf("Enter the harmonic number that you wish computed : ");
        int index = input.nextInt();

        double prev_har = 0;
        double harmonicVal;
        int i = 1;
        while(i <= index){
            System.out.printf("K = %4d  ", i);
            double inv = 1f/i;
            System.out.printf("term = %8f  ", inv);
            harmonicVal = prev_har + 1f/i;
            System.out.printf("Harmonic value = %8f\n", harmonicVal);
            prev_har = harmonicVal;
            i++;
        }

        input.close();
    }
}
