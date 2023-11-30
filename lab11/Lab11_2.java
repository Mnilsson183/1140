public class Lab11_2 {
    public static void main(String[] args) {
        int BOARDSIZE = 9;
        //int[][] board = new int[BOARDSIZE][BOARDSIZE];

        int[][] board = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
        };

        

        boolean[] badRow = new boolean[BOARDSIZE];
        int[] badRowSpots = new int[BOARDSIZE];
        int[] badRowValue = new int[BOARDSIZE];
        for(int i = 0; i < BOARDSIZE; i++){
            boolean[] checkMap = new boolean[BOARDSIZE];
            for(int j = 0; j < BOARDSIZE; j++){
                if(checkMap[board[i][j] - 1] == false){
                    checkMap[board[i][j] - 1] = true;
                } else{
                    badRow[i] = true;
                    badRowValue[i] = board[i][j];
                    badRowSpots[i] = j;
                }
            }

        }

        boolean[] badColumn = new boolean[BOARDSIZE];
        int[] badColumnSpots = new int[BOARDSIZE];
        int[] badColumnValue = new int[BOARDSIZE];
        for(int i = 0; i < BOARDSIZE; i++){
            boolean[] checkMap = new boolean[BOARDSIZE];
            for(int j = 0; j < BOARDSIZE; j++){
                if(checkMap[board[i][j] - 1] == false){
                    checkMap[board[i][j] - 1] = true;
                } else{
                    badColumn[i] = true;
                    badColumnValue[i] = board[i][j];
                    badColumnSpots[i] = j;
                }
            }

        }

        for(int i = 0; i < BOARDSIZE; i++){
            for(int j = 0; j < BOARDSIZE; j++){
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }

        //  prints the coords and the value of the error
        for(int i = 0; i < BOARDSIZE; i++){
            if(badRow[i] == true){
                System.out.printf("ISSUE at ( %d , %d ) extra %d\n", badRowSpots[i] + 1, i + 1, badRowValue[i]);
            }
        }
    }
}
