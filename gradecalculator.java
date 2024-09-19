import java.util.Scanner;

public class gradecalculator {

    // Method to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] marks = new double[5];  // Array to hold marks of 5 subjects
        double totalMarks = 0;

        // Taking input for marks obtained in each subject (exactly 5 subjects)
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            totalMarks += marks[i];  // Summing up the marks
        }

        // Calculating percentage (total marks out of 500)
        double percentage = (totalMarks / 500) * 100;

        // Calculating grade
        String grade = calculateGrade(percentage);

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks + " out of 500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
