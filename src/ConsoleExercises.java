
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
   public static void main(String[] args){

      Scanner in = new Scanner(System.in);
      //Question 1
      double pi = 3.14159;
      System.out.printf("The value of pi is approximately %.2f.",pi);

      //Explore Scanner class
      //Question 1:
      System.out.print("Please enter an integer: ");
      int number = in.nextInt();

      //When the input is not an integer, an error message populates.

      //Question 2
//      Scanner scanner = new Scanner(System.in);

      System.out.print("Please enter three words ");
      String wordOne = in.next();
      String wordTwo = in.next();
      String wordThree = in.next();

      System.out.println("You entered these three words " + wordOne + " " + wordTwo +" "+ wordThree);
      System.out.printf("You entered these three words %s %s %s %n",wordOne,wordTwo, wordThree);

      //Question 3
      System.out.println("Please enter a sentence");
      String sentence = in.next();

      System.out.println("Is this your sentence? "+sentence);
      //The entire snetence did not populate.

      //Question 4
      System.out.println("Please enter a sentence");
      String words = in.nextLine();
      System.out.println("Is this your sentence? "+ words);

      //Calcualte the perimter
      //Qustion 1
      System.out.print("What is the length and width of your room?");
      double lengthSize = Double.parseDouble(in.nextLine());
      double widthSize = Double.parseDouble(in.nextLine());

//      String length = in.nextLine();
//      String width = in.nextLine();

//      double lengthSize = parseDouble(length);
//      double widthSize = parseDouble(width);
//      int lenght2 = parseInt(length);
//      int width1 = parseInt(width);
//      int width2 = parseInt(width);

      //Question 2
      double area = lengthSize * widthSize;
      double perimiter = (lengthSize*2) + (widthSize*2);
      System.out.println("The area of your room is: "+ area);
      System.out.print("The peremiter of your room is: "+ perimiter);






   }
}
