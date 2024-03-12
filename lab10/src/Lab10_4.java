import java.util.Scanner;

public class Lab10_4 {
    public static void main(String[] args) {
        System.out.println("Using Arrays for Statistics Fun");
        Scanner input = new Scanner(System.in);
        System.out.print("What is the range of values you wish to test 0 .. ? :");
        int rangeMax = input.nextInt();
        input.close();

        boolean[] checkMap = new boolean[rangeMax + 1];
        int value;
        int tries = 0;
        int count = 0;

        while (count < rangeMax + 1) {
            value = (int)(Math.random() * (rangeMax + 1));
            System.out.printf("Number %d = %d\n", tries, value);
            if(checkMap[value] == false){
                checkMap[value] = true;
                count++;
            }
            // for(int i = 0; i < checkMap.length; i++){
            //     if(checkMap[i] == false){
            
            //         break;
            //     }
            //     if(i == checkMap.length){
            //         return;
            //     }
            // }
            tries++;
        }
                  System.out.printf("It took %d draws to pick every value in the range 0 to 10\n", tries);
  
    }
}
