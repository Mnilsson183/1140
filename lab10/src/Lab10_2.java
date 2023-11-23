
public class Lab10_2{
	public static void main(String[] args) {
		final int SET_SIZE = 15;
		int [] values = new int[SET_SIZE];
		for(int i = 0; i < SET_SIZE; i++){
			values[i] = (int)(Math.random() * 99 + 1);
			System.out.printf("%d ", values[i]);
		}
		int shuffleValue;
		int tmp_int;
		
		for(int i = 0; i < values.length; i++){
			if(values[i] % 2 == 0){
				shuffleValue = values[i];
				for(int j = i - 1; j > 0; j--){
					values[j + 1] = values[j];
				}
				values[0] = shuffleValue;
			}
		}

		System.out.printf("\n");
		for(int i = 0; i < values.length; i++){
			System.out.printf("%d\n", values[i]);
		}
		
	}
}
