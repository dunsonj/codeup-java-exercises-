import java.util.Arrays;

public class ArraysExercises {
    //Question 1
    public static Person[] addPerson( Person[] placeHolder, Person addedPerson) {
        Person[] morePeople = Arrays.copyOf(placeHolder , placeHolder.length+1);
        morePeople[morePeople.length-1] = addedPerson;
        return morePeople;
     }

    public static void main(String[] args) {
        //Question 1
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
//The location in memory is displaying in the code.
        Person kira = new Person("Nora");
        Person kj = new Person("Nova");
        Person karilen = new Person("Tavis");
        Person julio = new Person("Samantha");

        Person[] people = new Person[3];
        people[0] = kira;
        people[1] = kj;
        people[2] = karilen;
        Person[] addedPeople = addPerson(people, julio);


        for (Person person : people) {
            System.out.println(person.getName());
        }

        for (Person person : addedPeople) {
            System.out.println(person.getName());
        }

    }
}
