
public class Lab10_2{
	public static void main(String[] args) {

		boolean debug = true;
		
		final int SET_SIZE = 15;
		int [] values = new int[SET_SIZE];
		System.out.printf("Initial\nList = ");
		for(int i = 0; i < SET_SIZE; i++){
			values[i] = (int)(Math.random() * 99 + 1);
			System.out.printf("%d ", values[i]);
		}
		System.out.printf("\n");
		int shuffleValue;
		int patternCatching = 0;
		
		for(int i = values.length - 1; i > 0;){
			patternCatching++;
			if(patternCatching >= i){
				i--;
				patternCatching = 0;
			}
			if(values[i] % 2 == 0){
				shuffleValue = values[i];
				for(int j = i - 1; j >= 0; j--){
					values[j + 1] = values[j];
				}
				values[0] = shuffleValue;
				if(debug){
					for(int x = 0; x < values.length; x++){
						System.out.printf("%d ", values[x]);
					}
					System.out.println();
				}
			} else{
				i--;
			}
		}

		System.out.printf("\nEven Odd\nList = ");
		for(int i = 0; i < values.length; i++){
			System.out.printf("%d ", values[i]);
		}
		System.out.println();
	}
}
