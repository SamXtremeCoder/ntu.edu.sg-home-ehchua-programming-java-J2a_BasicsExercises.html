import java.util.*;

public class GradesAverage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int nOfStudents = Integer.parseInt(s.nextLine());
		int[] students = new int[nOfStudents];
		enterGrades(students, s);
		double averageGrades = getAverageGrade(students);
		System.out.println(averageGrades);

	}
	
	public static int[] enterGrades(int[] students, Scanner s) {
		int studentNumber = 1;
		for (int i = 0; i < students.length; i++) {
			System.out.print("Enter the grade for student " + studentNumber + ": ");
			
			while (true) {
			int grade = Integer.parseInt(s.nextLine());	
			if (grade >= 0 && grade <= 100) {
				students[i] = grade;
				break;
				}	
			
				System.out.println("Invalid grade, try again... ");
				System.out.print("Enter the grade for student " + studentNumber + ": ");
				grade = Integer.parseInt(s.nextLine());
				s.nextLine();
				
			}
			studentNumber++;
		}
		return students;
	}
	
	public static double getAverageGrade(int[] students) {
		double average = 0;
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			sum = sum + students[i];
		}
		
		average = sum / students.length;
		return average;
	}
}
