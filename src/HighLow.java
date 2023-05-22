import java.util.Random;
import java.util.Scanner;

public class HighLow {
    private static final scanner input = new Scanner(System.in);
    private static final int MAX_GUESSES = 5;

    public static void main(String[] args) {
        //Game Devlopment 101
        int answer = rollADie(100);

        int guessCounter = 0;

        while (true){
            System.out.println("answer is :" + answer);
            System.out.println("Guess a number from 1 to 100: ");

            int guess = getInteger(1, 100);
            guessCounter++;

            boolean guessedIt = checkGuess(guess, answer);
            if(guessedIt){
                break;
            }
        }

        System.out.println("Bye");


    }

//        public void playGame(){
//        if (userInput < randNum){
//            System.out.println("Guess Higher");
//        } else if (userInput > randNum){
//            System.out.println("Guess Lower");
//        } else {
//            System.out.println("Good Guess!");
//        }
//        }
//        // userInput === randNum)
//
//    int userInput;
//    Scanner in = new Scanner(System.in);
//    System.out.println("Guess a number between 1 and 100");
//
//    userInput = Integer.parseInt(in.next());
//
//    int randNum = rand.nextInt(100) + 1;
//
//



}
