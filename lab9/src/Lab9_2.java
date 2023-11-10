import java.util.Scanner; 

public class Lab9_2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.printf("\nMultiple choice grading\n");
		System.out.printf("Enter answer key     : ");
		String key = input.nextLine();
		System.out.printf("Enter student answers: ");
		String answers = input.nextLine();

		if(key.length() != answers.length()){
			System.out.printf("These are not of the same size\n");
			input.close();
			return;
		}

		int correct = 0;
		for(int i = 0; i < answers.length(); i++){
			if(answers.charAt(i) == key.charAt(i)){
				correct++;
			}
		}

		System.out.printf("Quiz Score           : %d/%d\n", correct, answers.length());
		input.close();
	}
}
