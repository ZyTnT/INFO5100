import java.util.List;

public class PatientHistory {
    private  List<Patient> patientHistory;

    public PatientHistory(List<Patient> l){
        this.patientHistory = l;
    }


    public List<Patient> getPatientHistory() {
        return patientHistory;
    }


    public void addVitals(Patient patient){
        patientHistory.add(patient);
    }
}
