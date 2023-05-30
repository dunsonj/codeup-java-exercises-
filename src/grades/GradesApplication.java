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


        System.out.println("Welcome");

        while (true) {
            System.out.println("Which student do you want more informatin on?");

            String userInput;

//            String checkStudentsName = input.getString();
            for (String person : students.keySet()) {
                System.out.println("- " + person);
            }
            System.out.println("Do you want to continue y/n");

            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("n")) {
                break;
            }

            Student student = students.get(userInput);
            if (student != null) {
                System.out.println("\nStudent Name: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average of the grades is: " + student.getGradeAverage());
            } else {
                System.out.println("\nNo student found with that name");
            }
        }
        System.out.println("Good bye, exiting application, Gooodbye. ");

    }


}

