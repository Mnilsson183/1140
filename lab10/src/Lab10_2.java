public class Lab10_2 {
    public static void main(String[] args) {
        System.out.println("Using Arrays to organize odd/even numbers");
        final int SET_SIZE = 15;
		int [] values = new int[SET_SIZE];
		System.out.printf("\nInitial\nList = ");
		for(int i = 0; i < SET_SIZE; i++){
			values[i] = (int)(Math.random() * 99 + 1);
			System.out.printf("%d ", values[i]);
		}
		System.out.printf("\n");

        int even_index = 0;
        int odd_index = values.length - 1;
        int [] sortedValues = new int[SET_SIZE];

        for(int i = 0; i < values.length; i++){
            if(values[i] % 2 == 0){
                sortedValues[even_index] = values[i];
                even_index++;
            } else if(values[i] % 2 == 1){
                sortedValues[odd_index] = values[i];
                odd_index--;
            }
        }

        System.out.printf("Even odd\nList = ");
        for(int i = 0; i < sortedValues.length; i++){
            System.out.printf("%d ", sortedValues[i]);
        }
        System.out.printf("\n");
    }
}
