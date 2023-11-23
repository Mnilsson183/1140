
public class Lab10_1{
	public static void main(String[] args) {
		int[] values = {1, 3, 5, 7, 8, 99, 22, 1, 32, 69, 42, 1111};

		for(int i = 0; i < values.length - 1; i++){
			System.out.printf("Gap %d : %d\n", i + 1, values[i + 1] - values[i]);
		}

	}
}
