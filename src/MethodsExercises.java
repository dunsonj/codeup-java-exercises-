

import java.util.Random;
import java.util.Scanner;


public class MethodsExercises {
    static Scanner in = new Scanner(System.in);
   static  Random rand = new Random();

    public static void main(String[] args) {
        System.out.println(addNum(1, 2));
        System.out.println(subNum(5, 2));
        System.out.println(mulNum(3, 3));
        System.out.println(divNum(15, 5));
        System.out.println(modulusNum(9, 2));

        //Question 2
        System.out.println(getInteger(1, 10));

        //Question 3
//        System.out.println(getFactoral());

        //Question 4
        System.out.println(getRandom());




    }

    public static int addNum(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int subNum(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public static int mulNum(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public static int divNum(int numOne, int numTwo) {
        return numOne / numTwo;
    }

    public static int modulusNum(int numOne, int numTwo) {
        return numOne % numTwo;
    }

    //Quetion 2
//
    public static int getInteger(int min, int max) {
//        System.out.println("Enter a number between 1 and 10");
        int userInput;
        do {
            System.out.println("Enter a number between" + min + "and " + max);
            userInput = Integer.parseInt(in.next());
        } while (userInput <= min || userInput >= max);
        return userInput;
    }

//recursion method:
//        public static int getInteger(int min, int max) {
//            int userIn = Integer.parseInt(in.nextLine());
//            if(userIn < min || userIn > max) {
//                System.out.println("Number was not in range, try again:");
//                return getInteger(min, max);
//            } else {
//                return userIn;
//            }
//
//        }


        //Question 3
/*

        public static String getFactoral() {
            long userNumber;

            long fact = 1;
            System.out.println("Enter a number 1 to 10");
            userNumber = Long.parseLong(in.next());

            for (int i = 1; i <= userNumber; i++) {
                fact = fact * i;
            }
            return userNumber + "! = " + fact;

        }
*/
        //Question 4
    public static String getRandom () {
        int numberOfUser;
        System.out.println("Enter a number of sides");
        numberOfUser = Integer.parseInt(in.next());

        System.out.println("Roll the dice");

        int randIntOne = rand.nextInt(6)+1;
        int randIntTwo = rand.nextInt(6)+1;

        return "The results are: " + randIntOne + " " + randIntTwo;

    }

}

