package builder.java;

public class Client {
    public static void main(String[] args) {
        Student s = Student.getBuilder().setAge(32).setName("Aditya").setPsp(90d).build();
    }
}
