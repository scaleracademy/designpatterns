package builder.java;

public class Student {
    private int age;
    private String name;
    private double psp;

    private Student(Builder b)
    {
        //validationCheck();
        this.age = b.age;
        this.name = b.name;
        this.psp = b.psp;
    }

    public static Builder getBuilder()
    {
        return new Builder();
    }

    public static class Builder {
        private int age;
        private String name;
        private double psp;

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setPsp(double psp){
            this.psp = psp;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }
    }
}
