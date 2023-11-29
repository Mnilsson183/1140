
public class Lab10_1{
	public static void main(String[] args) {
		System.out.println("Array Processing");
		int[] values = {1, 3, 5, 7, 8, 99, 22, 1, 32, 69, 42, 1111};
		boolean sorted = true;

		System.out.print("List is ");
		for(int i = 0; i < values.length; i++){
			System.out.printf("%d ", values[i]);
		}
		System.out.printf("\n");

		int gap;
		for(int i = 0; i < values.length - 1; i++){
			gap = values[i + 1] - values[i];
			System.out.printf("Gap %d : %d\n", i + 1, gap);
			if(gap < 0){
				sorted = false;
			}
		}
		if(!sorted){
			System.out.println("This matrix is not sorted");
		} else {
			System.out.println("This array is sorted");
		}

	}
}
