/**
 * Lab7_4
 */
import java.util.Scanner;

public class Lab7_4 {

    public static void main(String[] args) {
        String pickNames[] = {"ROCK", "PAPER", "SCISSORS"};

        Scanner input = new Scanner(System.in);

        System.out.println("Choices are  1: Rock");
        System.out.println("             2: Paper");
        System.out.println("             3: Scissors");

        System.out.printf("\nWhich do you choose (1,2,3) : ");
        int userChoice = input.nextInt();
                                            // range 1-3
        int computerChoice = (int)(Math.random() * 3 + 1);

        if(userChoice == computerChoice){
            System.out.printf("You picked %s and I picked %s: We tie\n", pickNames[userChoice], pickNames[computerChoice]);
        } else if(userChoice == 1 && computerChoice == 3){
            System.out.printf("You picked ROCK and I picked SCISSORS: You win\n");
        } else if(userChoice == 3 && computerChoice == 1){
            System.out.printf("You picked SCISSORS and I picked Rock: I win\n");
        } else if(userChoice < computerChoice){ 
            System.out.printf("You picked %s and I picked %s: I win\n", pickNames[userChoice - 1], pickNames[computerChoice - 1]);
        } else {
            System.out.printf("You picked %s and I picked %s: You win\n", pickNames[userChoice - 1], pickNames[computerChoice - 1]);
        }
    }
}