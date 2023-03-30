package prototype.java;

public class IntelligentStudent extends Student {
    public double psp;
    public double iq;

    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent o) {
        super(o);
        this.psp = o.psp;
        this.iq = o.iq;
    }

    public IntelligentStudent getClone() {
        return new IntelligentStudent(this);
    }
}
