import java.util.Date;

public class PatientInformation {
    private String name;
    private String sex;
    private Date birthday;
    private EncounterHistory encounterHistory = new EncounterHistory();

    public PatientInformation(Encounter encounter) {
        this.name = encounter.getPatientName();
        this.sex = encounter.getPatientSex();
        this.birthday = encounter.getPatientBirthday();
        this.encounterHistory.addEncounter(encounter);
    }

    public void PatientInformation(){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void updateEncounterHistory(Encounter encounter){
        this.encounterHistory.addEncounter(encounter);
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }
}
