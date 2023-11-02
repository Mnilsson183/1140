import java.util.Scanner;

public class Lab8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Probability Testing Program");
        System.out.printf("What Die total do you wish to test for (2 - 12):");
        int dice = input.nextInt();

        System.out.printf("Computed Probability for Die throw = ");
        int target = input.nextInt();

        System.out.printf("Die throws   Probability\n");

        double hits = 0;
        int roll = 0;;
        for(int i = 0; i <= 20000;i++){
            roll = (int)(Math.random() * dice) + 1;
            if(roll == target){
                hits++;
            }

            if(i % 1000 == 0 && i != 0){
                System.out.printf("%5d    %7f\n", i, hits / i * 100);
            }
        }
    }
}
