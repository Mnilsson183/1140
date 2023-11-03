import java.util.Scanner;

public class Lab8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Probability Testing Program");
        System.out.printf("What Die total do you wish to test for (2 - 12):");
        int target = input.nextInt();

        System.out.printf("Computed Probability for Die throw = %d\n", target); 

        System.out.printf("Die throws   Probability\n");

        double hits = 0;
        int d1;
        int d2;
        int i = 0;
        while(i <= 20000){
            d1 = (int)(Math.random() * 6) + 1;
            d2 = (int)(Math.random() * 6) + 1;
            if(d1 + d2 == target){
                hits++;
            }

            if(i % 1000 == 0 && i != 0){
                System.out.printf("%5d    %7f\n", i, hits / i);
            }
            i++;
        }
    }
}
