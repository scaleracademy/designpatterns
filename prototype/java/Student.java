package prototype.java;

public class Student {
    private String name;
    private int age;

    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(Student o){
        this.name = o.name;
        this.age = o.age;
    }

    public Student getClone(){
        return new Student(this);
    }
}
