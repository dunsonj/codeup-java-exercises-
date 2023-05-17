import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        //a. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
        //b. Do while
//        int num = 0;
//        do
//        {
//            System.out.println(num);
//            num +=2;
//        }
//        while (num <= 100);

//        int num = 100;
//        do
//        {
//            System.out.println(num);
//            num -=5;
//        }
//        while (num >= -10);

        //Do While part two


        long number = 2;
        do {
            System.out.println(number);

            number *= number;

        }
        while (number < 1000000);


        //Refactoring

//        for (long i = 100; i >= 10; i -= 5){
//            System.out.println(i);
//        }
//
//        for (lonh i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//        }


        //Question 2

        for (int numm = 0; numm <= 100; numm++) {

            if (numm % 3 == 0 && numm % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (numm % 3 == 0) {
                System.out.println("Fizz");
            } else if (numm % 5 == 0) {
                System.out.println("Buzz");
            }
        }

        //Question 3
        while (true) {
            System.out.print("Please enter an integer");
            int value = in.nextInt();

            System.out.println("Number\tSquare\tCube");
            System.out.println("------\t------\t------");
            for (int j = 1; j <= value; j++) {
                int square = j * j;
                int cube = j * j * j;
                System.out.println(j + "\t" + square + "\t" + cube);
            }
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = in.next();
            if (!choice.equalsIgnoreCase("yes" )) {
                break;
            }
        }
        System.out.println("Program ended.");


//            //Question 4
        System.out.print("Please enter a numeric grade from 0 to 100: ");
        int numeriGrade = in.nextInt();

        if (numeriGrade <= 100 && numeriGrade >= 88) {
            System.out.println("You have a \"A\"");
        } else if (numeriGrade <= 87 && numeriGrade >= 80) {
            System.out.println("You have a \"B\"");
        } else if (numeriGrade <= 79 && numeriGrade >= 67) {
            System.out.println("You have a \"C\"");
        } else if (numeriGrade <= 66 && numeriGrade >= 60) {
            System.out.println("You have a \"D\"");
        } else if (numeriGrade <= 59 && numeriGrade >= 0) {
            System.out.println("You have a \"F\"");
        } else {
            System.out.println("Default case");
        }

        in.close();

    }
}

