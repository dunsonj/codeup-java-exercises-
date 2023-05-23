import java.util.Arrays;
import java.util.Random;

//Question 2
public class ServerNameGenerator {
    public static String getRandom(String[] array) {
        int randNum = (int)Math.floor(Math.random()*(array.length-1));

        return array[randNum];
    }

    public static void main(String[] args) {

        String[] adjectives;
        adjectives = new String[10];
        adjectives[0] = "Beautiful";
        adjectives[1] = "Intelligent";
        adjectives[2] = "Brave";
        adjectives[3] = "Kind";
        adjectives[4] = "Creative";
        adjectives[5] = "Strong";
        adjectives[6] = "Joyful";
        adjectives[7] = "Generous";
        adjectives[8] = "Patient";
        adjectives[9] = "Confident";

        String[] nouns;
        nouns = new String[10];
        nouns[0] = "Dog";
        nouns[1] = "Book";
        nouns[2] = "Table";
        nouns[3] = "Car";
        nouns[4] = "Flower";
        nouns[5] = "Chair";
        nouns[6] = "Sun";
        nouns[7] = "Mountain";
        nouns[8] = "Tree";
        nouns[9] = "Phone";

        System.out.println("Your server name is: " + getRandom(adjectives) + " " + getRandom(nouns));
    }

}
