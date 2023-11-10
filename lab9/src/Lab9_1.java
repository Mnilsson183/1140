import java.util.Scanner; 

public class Lab9_1{
	public static void main(String[] args) {

		String[] directions = {"NORTH", "EAST", "SOUTH", "WEST"};

		Scanner input = new Scanner(System.in);

		System.out.println("Drunkards Walk");
		System.out.print("Number of steps: ");
		int steps = input.nextInt();

		int x = 0;
		int y = 0;

		System.out.printf("Step    Direction       Location\n");

		for(int i = 0 ;i < steps; i++){
			int stepDirection = (int)(Math.random() * 4);
			switch (stepDirection) {
				case 0: y++;
					break;
				case 1: x++;
					break;
				case 2: y--;
					break;
				case 3: x--;
					break;
				default:
					break;
			}
			System.out.printf("%3d     %7s          (  %3d,  %3d  )\n", i, directions[stepDirection], x, y);
		}
		double distToLamp = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.printf("Distance to the lamp post  = %.3f\n", distToLamp);
		input.close();
	}
}
