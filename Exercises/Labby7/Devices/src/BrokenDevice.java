import java.io.Serializable;

public class BrokenDevice extends Device implements Serializable {

    private String issue;
    private int daysToFix;

    public BrokenDevice(String make, String model, double price,String issue, int daysToFix) {
        super(make, model, price);
        this.issue=issue;
        this.daysToFix=daysToFix;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public int getDaysToFix() {
        return daysToFix;
    }

    public void setDaysToFix(int daysToFix) {
        this.daysToFix = daysToFix;
    }

    @Override
    public String toString() {
        return "\nBroken Device {\n"
                +"Make: "
                +super.getMake()+
                "\n"+"Model: "
                +super.getModel()+
                "\n"+"Price: "
                +super.getPrice()+
                "\n"+"Issue: "
                +issue+
                "\n"+"" +
                "Days to fix: "
                +daysToFix
                +"} \n";

    }
}
