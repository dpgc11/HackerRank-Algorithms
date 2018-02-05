package implementation;

import java.util.Scanner;

public class GradingStudents {

	static int[] solve(int[] grades) {
		// Complete this function
		for (int i = 0; i < grades.length; i++) {
			grades[i] = roundGrade(grades[i]);
		}
		return grades;
	}

	static int roundGrade(int grade) {
		int result = grade;

		if (grade >= 38) {
			float gradeMultiple = grade / 5;
			int gradeMod = grade % 5;
			if (gradeMod >= 3) {
				result = (int) (gradeMultiple + 1) * 5;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

	}

}
