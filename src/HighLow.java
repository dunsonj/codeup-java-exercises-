import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        //Game Devlopment 101
    }

        public void playGame(){
        if (userInput < randNum){
            System.out.println("Guess Higher");
        } else if (userInput > randNum){
            System.out.println("Guess Lower");
        } else {
            System.out.println("Good Guess!");
        }
        }
        // userInput === randNum)

    int userInput;
    System.out.println("Guess a number between 1 and 100");
    Scanner in = new Scanner(System.in);

    userInput = Integer.parseInt(in.next());

    int randNum = rand.nextInt(100) + 1;





}
