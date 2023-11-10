import java.util.Scanner;
import java.io.*;

public class Lab9_3{
	public static void main(String[] args) {
		Scanner input;
		try {
			File file = new File("/home/morgan/Desktop/1140/lab9/src/quizdata.txt");
			input = new Scanner(file);	
		} catch (Exception e) {
			System.err.println("No file found at path");
			return;
		}

		System.out.printf("Exam grading\n");

		String quizname = input.nextLine();
		System.out.println(quizname);

		int quizNum = input.nextInt();

		String answerKey = input.next();

		String answers;
		String name;
		int totalScore = 0;
		int score = 0;
		
		for(int quiz = 0 ; quiz < quizNum; quiz++){
			score = 0;
			answers = input.next();
			name = input.nextLine();
			for(int i = 0; i < answerKey.length(); i++){
				if(answerKey.charAt(i) == answers.charAt(i)){
					score++;
				}
			}
			totalScore += score;
			System.out.printf("%3d   : %s\n", score, name);
		}
		System.out.printf("Class average = %f\n",(float)totalScore / (float) quizNum);
		input.close();
	}
}
