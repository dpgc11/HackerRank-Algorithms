package implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numOfTestCases = reader.nextInt();
		while (numOfTestCases-- > 0) {
			int numOfStudents = reader.nextInt();
			int numOfStudentsRequired = reader.nextInt();
			int count = 0;
			while (numOfStudents-- > 0) {
				int arrivalTime = reader.nextInt();
				if (arrivalTime <= 0) {
					count++;
				}
			}
			if (count >= numOfStudentsRequired)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
