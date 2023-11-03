

public class Lab8_4 {
    public static void main(String[] args) {
        System.out.println("Casino Dice throw simulation");


        int d1;
        int d2;
        int d3;
        int winnings = 0;
        int i = 0;
        while(i < 10000){
            d1 = (int)(Math.random() * 6) + 1;
            d2 = (int)(Math.random() * 6) + 1;
            d3 = (int)(Math.random() * 6) + 1;

            if(d1 == 6 && d2 == 6 && d3 == 6){
                winnings = winnings + 20;
            } else if(d1 == d2 && d3 == d2){
                winnings = winnings + 10;
            } else if(d1 == d2 || d1 == d3 || d2 == d3){
                winnings = winnings + 5;
            } else {
                winnings--;
            }
            i++;
        }

        System.out.printf("After 10,000 runs the player made $%d\n", winnings);
        if(winnings > 0){
            System.out.printf("This is a bad game for the casino\n");
        } else{
            System.out.printf("This is a good game for the casino\n");
        }

    }
}
