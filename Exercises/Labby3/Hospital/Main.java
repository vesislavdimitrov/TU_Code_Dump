
public class Main {

    public static void main(String[] args) {

        SickPatient patient = new SickPatient("Dragan", "somewhere", "9512122121");

        patient.cure("aspirin", 7);

        System.out.println(patient.getDischargeSummary());
    }
}