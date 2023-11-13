import java.util.Scanner; 

public class Lab9_5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Pyramid shapes Program");
		System.out.printf("How many rows in your pyramid ( 3 - 9): ");
		int rows = input.nextInt();
		if(rows < 3 || rows > 9){
			System.out.println("Incorrect rows must be inbetween 3 and 9");
			input.close();
			return;
		}

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < rows - i; j++){
				System.out.printf(" ");
			}
			for(int j = 0; j < i * 2 + 1; j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		input.close();
	}	
}
