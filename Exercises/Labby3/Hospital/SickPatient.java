
public class SickPatient extends Patient{

    private String dischargeSummary;

    public SickPatient(String name, String address, String egn) {
        super(name, address, egn);
    }


    @Override
    public void cure(String drug, int days) {
        String data = drug + " " + days;
        setDischargeSummary(data);
    }

    public String getDischargeSummary() {
        return dischargeSummary;
    }

    public void setDischargeSummary(String dischargeSummary) {
        this.dischargeSummary = dischargeSummary;
    }
}