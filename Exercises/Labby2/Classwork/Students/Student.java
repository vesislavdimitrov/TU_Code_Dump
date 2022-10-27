public class Student extends Person{

    double pikMark;
    double teMark;
    double ppeMark;

    Student(String name, String birthDate, double pikMark, double teMark,
            double ppeMark) {
        super(name, birthDate);

        this.pikMark=pikMark;
        this.teMark=teMark;
        this.ppeMark=ppeMark;

    }

    public double getPpeMark() {
        return ppeMark;
    }

    public void setPpeMark(double ppeMark) {
        this.ppeMark = ppeMark;
    }

    public double getTeMark() {
        return teMark;
    }

    public void setTeMark(double teMark) {
        this.teMark = teMark;
    }

    public double getPikMark() {
        return pikMark;
    }

    public void setPikMark(double pikMark) {
        this.pikMark = pikMark;
    }

    public void ppeExam(double mark){

        setPpeMark(mark);
        System.out.println(this.getName()+" has been examined in PPE.");
        System.out.println("Their mark is: "+getPpeMark());
    }
    public void teExam(double mark){

        setTeMark(mark);
        System.out.println(this.getName()+" has been examined in TE.");
        System.out.println("Their mark is: "+getTeMark());
    }
    public void pikExam(double mark){

        setPikMark(mark);
        System.out.println(this.getName()+" has been examined in PIK.");
        System.out.println("Their mark is: "+getPikMark());
    }




}
