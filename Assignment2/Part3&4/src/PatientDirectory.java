import java.util.ArrayList;
import java.util.List;

public class PatientDirectory {
    private List<PatientInformation> patientDirectory = new ArrayList<>();

    public PatientDirectory(){}

    public PatientDirectory(List<PatientInformation> l){
        this.patientDirectory = l;
    }

    public List<PatientInformation> getPatientDictory() {
        return patientDirectory;
    }

    public void addPatientInfo (PatientInformation patientInfomation){
        this.patientDirectory.add(patientInfomation);
    }

    public void addNewPatient(Encounter encounter){
        Boolean flag = false;
        for (PatientInformation p:patientDirectory){
            if (encounter.getPatientName() == p.getName()){
                p.updateEncounterHistory(encounter);
                flag = true;
                System.out.println("This patient has existed in Patient Directory, encounter history has updated");
            }
        if(!flag) {
            PatientInformation newPatient = new PatientInformation(encounter);
            addPatientInfo(newPatient);
            System.out.println(encounter.getPatientName() + " not exist in Patient Directory, has created in Patient Directory");
            }
        }
    }
}
