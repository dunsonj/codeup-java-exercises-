package util;

import java.util.Scanner;
public class Input {

    //    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }


    /*
       public int getInt(){
          return this.scanner.nextInt();
       }
       public double getDouble(){
           return this.scanner.nextDouble();
       }
    */
    public int getInt(int min, int max) {
        int userNum = Integer.valueOf(this.getString());
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        System.out.println("Number is not in bounds");
        return getInt(min, max);
    }

    public double getDoub(double min, double max) {
        double userDouble = Double.valueOf(this.getString());
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }
        System.out.println("Number is not in bounds");
        return getDoub(min, max);
    }

    int input;

    public int getInt() {
        while (true) {
            try {
                String input = getString();
                return Integer.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public double getDouble() {
        while (true) {
            try {
                String input = getString();
                return Double.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    //----------------------------------------------------------------------
//bonus
    public int getInt(int min, int max, String prompt) {
        int userNum = Integer.valueOf(this.getString());
        System.out.println(prompt);
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        System.out.println("Number is not in bounds");
        return getInt(min, max, prompt);
    }

    public double getDoub(double min, double max, String prompt) {
        System.out.println(prompt);
        double userDouble = Double.valueOf(this.getString());
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }
        System.out.println("Number is not in bounds");
        return getDoub(min, max, prompt);
    }
}




//---------------------------------------------------------------------

    /*
    public static void main(String[] args) {
        Input inputOne = new Input();
//        System.out.println("Get String: ");
//        System.out.println(inputOne.getString());
//        System.out.println("yesNo: ");
//        System.out.println(inputOne.yesNo());
        System.out.println("Give me a number between 1 and 10");
        System.out.println(inputOne.getDouble());
        System.out.println("Give me a number between 1 and 10");
        System.out.println(inputOne.getInt());

        System.out.println("Give me a number between 1 and 10");
        System.out.println(inputOne.getInt(1,10));

        System.out.println("Give me a number between 1.0 and 10.0");
        System.out.println(inputOne.getDoub(1,10));

        System.out.println("Give me a number between 1 and 10");
        System.out.println(inputOne.getInt(1,10, "Give me a number between 1 and 10"));

        System.out.println("Give me a number between 1.0 and 10.0");
        System.out.println(inputOne.getDoub(1,10, "Give me a number between 1 and 10"));

    }
}

     */
