import com.sun.security.jgss.GSSUtil;

public class Person {
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, "+ name + "!");
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
//        Person jakira = new Person("Jakira");
//        System.out.println(jakira.getName());
//        jakira.setName("Nora");
//        System.out.println(jakira.getName());
//        jakira.sayHello();


        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        System.out.println(person1);
        System.out.println(person2);






    }






}
