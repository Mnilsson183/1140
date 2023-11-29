import java.util.Scanner;

public class Lab10_3 {
    public static void main(String[] args) {
        System.out.println("Using Arrays to find number sets");

        Scanner input = new Scanner(System.in);
        System.out.printf("How many values do you wish to generate : ");
        final int range = 21;
        final int valuesToGenerate = input.nextInt();
        input.close();

        int [] values = new int[valuesToGenerate];
        boolean[] checkMap = new boolean[range];

        System.out.printf("Random numbers : ");
        for(int i = 0; i < values.length; i++){
            values[i] = (int)(Math.random() * range);
            System.out.printf("%d ", values[i]);
        }
        for(int i = 0; i < values.length; i++){
            if(checkMap[values[i]] == false){
                checkMap[values[i]] = true;
            }
        }
        System.out.printf("\nSet values = {");
        for(int i = 0; i < checkMap.length; i++){
            if(checkMap[i] == true){
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("}\n");
    }
}
