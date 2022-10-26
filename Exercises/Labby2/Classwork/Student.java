public class Student extends Person {

    private String fNum;

    public Student() {
        super();
        this.fNum = "";
    }

    public Student(String name, String egn, String fNum) {
        super(name, egn);
        this.fNum = fNum;
    }

    public String getFnum() {
        return this.fNum;
    }

    public void setFnum(String f) {
        this.fNum = f;
    }
}
