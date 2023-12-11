package demo;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Thiha","MIT");
        Student studentClone = (Student) student.clone();

        boolean test =student.equals(studentClone);

        System.out.println("same memory address::"+test);

        System.out.println(student);
        System.out.println(studentClone);

        studentClone.setName("Thiha Linn");
        studentClone.setSchool("ISM");
        System.out.println("After changing student clone::"+studentClone);
        System.out.println("Ordinary Student::"+student);
    }
}
