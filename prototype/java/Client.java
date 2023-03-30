package prototype.java;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("new", 20);
        Student s1 = new Student(s);
        Student s2 = s1.getClone();

        IntelligentStudent s3 = new IntelligentStudent();
        IntelligentStudent s4 = new IntelligentStudent(s3);
    }
}
