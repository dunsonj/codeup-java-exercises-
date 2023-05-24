package movies;
import util.Input;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static Movie[] mList = findAll();

        public static void main (String[]args){
            Input in = new Input();
            System.out.println("Hello, Welcome to my movie application!");
            int choice = -1;
            while(choice !=0) {
                printMenu();

                choice = in.getInt(0, 5);

                doChoice(choice);
            }
        }
    private static void printMenu() {
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("""
                0 - exit");
                1 - view all movies");
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category

                Enter your choice: """);
    }

    private static void doChoice ( int choice) {
        switch (choice) {
            case 1:
                for (Movie pMovie : mList) {
                    System.out.println(pMovie.getName() + "---" + pMovie.getCategory());
                }
                break;
            case 2:
                printMovies("animated");
                break;
            case 3:
                printMovies("drama");
                break;
            case 4:
                printMovies("horror");
                break;
            case 5:
                printMovies("scifi");
                break;
        }
    }

        public static void printMovies (String category){
            for (Movie pMovie : mList) {
                if (pMovie.getCategory().equals(category) || category.equalsIgnoreCase("all")) {
                    System.out.println(pMovie.getName() + "---" + pMovie.getCategory());
                }
            }
        }



    }

