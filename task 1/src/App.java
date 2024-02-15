import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        while (true) {
            System.out.println("Enter a grade (or -1 to finish):");
            int grade = sc.nextInt();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
            return;
        }
        sc.close();

        int sum = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            sum += grade;
        }
        double average = (double) sum / grades.size();
        System.out.println("The average grade: " + average);
        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);
    }
}
