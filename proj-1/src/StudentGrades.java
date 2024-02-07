import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get marks from the user
        System.out.print("Enter marks for the student: ");
        double[] marks = new double[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextDouble();
        }

        // Compute average
        double average = computeAverage(marks);

        // Display grade
        displayGrade(average);
    }

    // Compute average using the compute() method
    public static double computeAverage(double[] marks) {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Display grade based on average
    public static void displayGrade(double average) {
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Student grade: " + grade);
    }
}
