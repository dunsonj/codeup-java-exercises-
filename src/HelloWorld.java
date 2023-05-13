public class HelloWorld {
    public static void main (String [] args) {
        System.out.println("Hello, World");

        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        var myString = "This is my string";
        System.out.println(myString);

        myString = "Learning Java";
        System.out.println(myString);
/*
        myString = 3.14159;
        The code does not work because this variable is declared as a string.

 */
        long myNumber;
        /*
        System.out.println(myNumber);
        According to the sustem the number has not been initialized
         */



        /*
        myNumber = 3.14159;
        According to the system this is not correct
         */

        myNumber = 123L;
        System.out.println(myNumber);
        /*
        Adding L allowed the code to execute
         */
        myNumber = 123;
        System.out.println(myNumber);
/*
It didnt work with 3.1459 because that is a double number
 */


/*
myNumber = 3.14f;
According to the compiler it expects a long


 */

 /*
 var class;

 It states it cannot resolve var
  */


/*
        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;

        int three = (int) "three";

        it just basically said it finished with exit code one

        not really understanding the error message

*/
//shorthand assignments:

        int x = 4;
        x = x + 5;
//------------------------
        x += 5;
        System.out.println(x);
//shorthand assignments:
        int x = 3;
        int y = 4;
        y = y * x;
//---------------------------
        y *= x;
        System.out.println(y);
// shorthand assignments:
        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
//-----------------------
    x /= y;
    y -= x;
        System.out.println(x);
        System.out.println(y);


    }
}
