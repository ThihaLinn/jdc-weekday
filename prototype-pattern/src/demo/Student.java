package demo;

public class Student implements IPrototype {

    private String name;

    private String school;

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }
}
