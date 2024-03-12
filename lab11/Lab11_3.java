import java.util.Scanner;

public class Lab11_3 {
    public static void main(String[] args) {


        int BOMB = -1;        
        int mapMaxHeight = 10;
        int mapMaxWidth = 10;
        System.out.printf("How many bomb's would you like to place: ");
        Scanner input = new Scanner(System.in);
        int bombNumber = input.nextInt();
        input.close();

        int[][] map = new int[mapMaxWidth][mapMaxHeight];

        for(int i = 0; i < bombNumber; i++){
            int x;
            int y;
            while(true){
                y = (int)(Math.random() * mapMaxHeight);
                x = (int)(Math.random() * mapMaxWidth);
                if(map[x][y] != BOMB){
                    map[x][y] = BOMB;
                    break;
                }
            }
        }

        for(int x = 0; x < mapMaxWidth; x++){
            for(int y = 0; y < mapMaxHeight; y++){
                int numberOfBombFriends = 0;
                if(map[x][y] != BOMB){

                    // check side cases
                    if(x - 1 >= 0) {
                        if(map[x - 1][y] == BOMB) numberOfBombFriends++;
                    }
                    if(x + 1 < mapMaxWidth) {
                        if(map[x + 1][y] == BOMB) numberOfBombFriends++;
                    }
                    if(y - 1 >= 0) {
                        if(map[x][y - 1] == BOMB) numberOfBombFriends++;
                    }
                    if(y + 1 < mapMaxHeight) {
                        if(map[x][y + 1] == BOMB) numberOfBombFriends++;
                    }

                    // corner cases
                    if(x - 1 >= 0 && y + 1 < mapMaxHeight){
                        if(map[x - 1][y + 1] == BOMB) numberOfBombFriends++;
                    }
                    if(x + 1 < mapMaxWidth && y + 1 < mapMaxHeight){
                        if(map[x + 1][y + 1] == BOMB) numberOfBombFriends++;
                    }
                    if(x - 1 >= 0 && y - 1 >= 0){
                        if(map[x - 1][y - 1] == BOMB) numberOfBombFriends++;
                    }
                    if(x + 1 < mapMaxWidth && y - 1 >= 0){
                        if(map[x + 1][y - 1] == BOMB) numberOfBombFriends++;
                    }
                    map[x][y] = numberOfBombFriends;
                }
            }
        }


        // print me please
        for(int x = 0; x < mapMaxWidth; x++){
            for(int y = 0; y < mapMaxHeight; y++){
                if(map[x][y] == BOMB){
                    System.out.printf("%c ", '*');
                } else if(map[x][y] == 0){
                    System.err.printf("%c ", '.');
                }else{
                    System.out.printf("%d ", map[x][y]);
                }
            }
            System.out.println();
        }
        
        }
}
