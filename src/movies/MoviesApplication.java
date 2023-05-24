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
                System.out.println("What would you like to do?");
                System.out.println("");
                System.out.println("0 - exit");
                System.out.println("1 - view all movies");
                System.out.println("2 - view movies in the animated category");
                System.out.println("3 - view movies in the drama category");
                System.out.println("4 - view movies in the horror category");
                System.out.println("5 - view movies in the scifi category");

                System.out.println("Enter your choice: ");

                choice = in.getInt(0, 5);

                doChoice(choice);
            }
        }
        private static void doChoice ( int choice){
            switch (choice) {
                case 1:
                    for(Movie pMovie : mList){
                        System.out.println(pMovie.getName() + "---" +pMovie.getCategory());
                    }
                    break;
                case 2:
                for(Movie pMovie : mList){
                    if(pMovie.getCategory().equals("animated")){
                        System.out.println(pMovie.getName() + "---" +pMovie.getCategory());
                    }
                }
                break;
                case 3:
                    for(Movie pMovie : mList){
                        if(pMovie.getCategory().equals("drama")){
                            System.out.println(pMovie.getName() + "---" +pMovie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for(Movie pMovie : mList){
                        if(pMovie.getCategory().equals("horror")){
                            System.out.println(pMovie.getName() + "---" +pMovie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for(Movie pMovie : mList){
                        if(pMovie.getCategory().equals("scifi")){
                            System.out.println(pMovie.getName() + "---" +pMovie.getCategory());
                        }
                    }
                    break;
            }
        }
    }

