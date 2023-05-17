import java.util.Scanner;

public class StringExercise_Bob {
    public static void main(String[] args) {
        //Question 2 of Strings excercise:
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, I'm Bob a lackadaisical teenager.");

        String answer;

        do{
            System.out.println("Interact with me! (Please punctuate)");
            String userInput = in.nextLine();

            if(userInput.endsWith("?")){
                System.out.println("Sure");
            }else if (userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals(" ")){
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("What ever.");
            }
            System.out.println("Would you like to continue y/n");
            answer = in.next();
            in.nextLine();

        }while(answer.equalsIgnoreCase("y"));









    }

}
