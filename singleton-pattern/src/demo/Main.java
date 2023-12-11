package demo;

public class Main {

    public static void main(String[] args) {
      Student s1 = Student.getStudent();
      Student s2 = Student.getStudent();

      boolean test = s1.equals(s2);

        System.out.println("s1 and s2 are the same:"+test);
        System.out.println(s1);
        System.out.println(s2);
    }

}
