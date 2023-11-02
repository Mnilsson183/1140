import java.util.Scanner;
import java.io.*;

public class Lab8_5 {
    public static void main(String[] args) throws Exception{
        final int INF = 999999999;
        File file = new File("/home/morgan/Desktop/1140/lab8/src/Lab8Data.txt");
        Scanner input = new Scanner(file);

        int numIndex = 0;
        int num;

        int negNums = 0;
        int posNums = 0;
        int negTotal = 0;
        int posTotal = 0;
        int min = INF;
        int max = -1 * INF;

        while(input.hasNextInt()){
            num = input.nextInt();
            System.out.printf("Number %d : %5d\n", numIndex + 1, num);
            if(num < 0){
                negNums++;
                negTotal = negTotal + num;
            } else if(num > 0){
                posNums++;
                posTotal = posTotal + num;
            }

            if(num > max){
                max = num;
            } else if(num < min){
                min = num;
            }
        }
        System.out.printf("\nStatistics for Positive values\n");
        System.out.printf("Count of positive numbers        : %2d\n", posNums);
        System.out.printf("Sum of positive numbers          : %2d\n", posTotal);

        System.out.printf("\nStatistics for Negative values\n");
        System.out.printf("Count of negative numbers        : %2d\n", negNums);
        System.out.printf("Sum of negative numbers          : %2d\n", negTotal);

        System.out.printf("\nOverall Stats\n");
        System.out.printf("Maximum number                   : %2d\n", max);
        System.out.printf("Minimum number                   : %2d\n", min);
    }
}
