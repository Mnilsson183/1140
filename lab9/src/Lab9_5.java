import java.util.Scanner; 

public class Lab9_5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("Pyramid shapes Program");
			System.out.printf("How many rows in your pyramid ( 3 - 9): ");
			int rows;
			while(true){
				System.out.printf("How many rows in your pyramid ( 3 - 9): ");
				rows = input.nextInt();
				if(rows >= 3 && rows <= 9){
					break;
				} else{
					System.out.printf("Incorrect – must be between 1 – 4\n\n");
				}
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

			System.out.print("Do you wish to do another (Y/N)? : ");
			char repeat = input.next().charAt(0);
			if(repeat == 'n' || repeat == 'N'){
				input.close();
				return;
			}
		}
	}	
}
