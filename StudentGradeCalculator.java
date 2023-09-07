import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int num = input.nextInt();
        int i = 1;
        int sum = 0;
        System.out.println("Enter the marks of the subjects out of 100: ");
        while (i <= num) {
            System.out.print("Subject " + i + ": ");
            int in = input.nextInt();
            i++;
            sum = sum + in;
        }
        System.out.println("Total Marks: " + sum);
        float Percentage = sum / (float) num;
        System.out.println("Average Percentage: " + Percentage + "%");
        if (Percentage >= 90) {
            System.out.println("Grade A");
        } else if (Percentage >= 80 && Percentage < 90) {
            System.out.println("Grade B");
        } else if (Percentage >= 70 && Percentage < 80) {
            System.out.println("Grade C");
        } else if (Percentage >= 60 && Percentage < 70) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }
        input.close();
    }
}
