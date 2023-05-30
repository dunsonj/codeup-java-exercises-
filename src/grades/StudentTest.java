package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jakira");
        student1.addGrade(100);
        student1.addGrade(98);
        student1.addGrade(97);

        System.out.println("Student 1: "+student1.getName());
        System.out.println("Grades: "+ student1.getGrades() );
        System.out.println("Grade Average: "+student1.getGradeAverage());

        Student student2 = new Student("Consuella");
        student2.addGrade(100);
        student2.addGrade(100);
        student2.addGrade(99);

        System.out.println("Student2: "+student2.getName());
        System.out.println("Grades: "+ student2.getGrades() );
        System.out.println("Grades: "+student2.getGradeAverage());

        Student student3 = new Student("Brandon");
        student3.addGrade(100);
        student3.addGrade(98);
        student3.addGrade(95);

        System.out.println("Student3: "+student3.getName());
        System.out.println("Grades: "+ student3.getGrades() );
        System.out.println("Grades: "+student3.getGradeAverage());

        Student student4 = new Student("Timothy");
        student4.addGrade(95);
        student4.addGrade(99);
        student4.addGrade(93);

        System.out.println("Student4: "+student4.getName());
        System.out.println("Grades: "+ student4.getGrades() );
        System.out.println("Grades: "+student4.getGradeAverage());



    }

}
