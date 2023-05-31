package grades;

import util.Input;

import java.util.Scanner;
import java.util.HashMap;


public class GradesApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student("Jakira");
        student1.addGrade(100);
        student1.addGrade(98);
        student1.addGrade(97);

        Student student2 = new Student("Consuella");
        student2.addGrade(100);
        student2.addGrade(100);
        student2.addGrade(99);

        Student student3 = new Student("Brandon");
        student3.addGrade(100);
        student3.addGrade(98);
        student3.addGrade(95);

        Student student4 = new Student("Timothy");
        student4.addGrade(95);
        student4.addGrade(99);
        student4.addGrade(93);


        HashMap<String, Student> students = new HashMap<>();
        students.put("Jakira", student1);
        students.put("Consuella", student2);
        students.put("Brandon", student3);
        students.put("Timothy", student4);


        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n");

        while (true) {
            System.out.print("What student would you like to see more information on?\n> ");
            String username = scanner.nextLine();

            if (students.containsKey(username)) {
                Student student = students.get(username);
                System.out.println("Name: " + student.getName() + " - GitHub Username: " + username);
                System.out.print("Name:" + student.getGrades() + "\n");
                System.out.println("Current Average: " + student.getGradeAverage() + "\n");

            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + username + "\".\n");
            }

            System.out.print("Would you like to see another student? (yes/no)\n> ");
            String choice = scanner.nextLine().toLowerCase();

            if (!choice.equals("yes")) {
                System.out.println("\nGoodbye, and have a wonderful day!");
                break;
            }
            System.out.println();
        }

        scanner.close();
    }

}