public class Lab11_1 {
    public static void main(String[] args) {
            int length = 4;
            int[][] magicMatrix = { {1, 1, 1, 1}, 
                                    {1, 2, 1, 1}, 
                                    {1, 1, 1, 1}, 
                                    {1, 1, 1, 1} };
        
            int[] rowSum = new int[length];
            int[] columnSum = new int[length];

        for(int row = 0; row < length; row++){
            int rowCurrentValue = 0;
                for(int column = 0; column < length; column++){
                    rowCurrentValue += magicMatrix[row][column]; 
                }
                rowSum[row] = rowCurrentValue;
        }
        for(int column = 0; column < length; column++){
            int columnCurrentValue = 0;
                for(int row = 0; row < length; row++){
                    columnCurrentValue += magicMatrix[row][column]; 
                }
            columnSum[column] = columnCurrentValue;
        }

        // refactor row and column length should always be the same
        // use fn
        boolean isGood = true;
        int goodValue = rowSum[0];
        for(int i = 0; i < length; i++){
                System.out.printf("row %d = %d ", i, rowSum[i]);
                if(rowSum[i] != goodValue){
                    isGood = false;
                    System.out.printf("NOT OKAY\n");
                } else {
                    System.out.printf("OKAY\n");
                }
        }
        for(int i = 0; i < length; i++){
                System.out.printf("col %d = %d ", i, columnSum[i]);
                if(columnSum[i] != goodValue){
                    isGood = false;
                    System.out.printf("NOT OKAY\n");
                } else {
                    System.out.printf("OKAY\n");
                }
        }

        int majorSum = 0;
        int minorSum = 0;
        for(int i = 0; i < length; i++){
                majorSum += magicMatrix[i][i];
                minorSum += magicMatrix[i][length - i - 1];
        }
        System.out.printf("Major Diagonal = %d ", majorSum);
        if(majorSum == goodValue){
            System.out.printf("OK\n");
        } else {
            System.out.printf("NOT OKAY\n");
            isGood = false;
        }

        System.out.printf("Minor Diagonal = %d ", minorSum);
        if(minorSum == goodValue){
            System.out.printf("OK\n");
        } else{
            System.out.printf("NOT OKAY\n");
            isGood = false;
        }

        if(isGood){
            System.out.println("This Square is Magical");
        } else {
            System.out.println("This Square is NOT Magical");
        }

    }
}
