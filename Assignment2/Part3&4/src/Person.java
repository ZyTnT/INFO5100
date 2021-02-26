public class Person {
    private String name;
    private String sex;
    private int age;
    private boolean isPatient = false;
    private String residence;
    private EncounterHistory encounterHistory = new EncounterHistory();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPatient() {
        return isPatient;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void becomePatient(Encounter encounter){
        this.isPatient = true;
        this.encounterHistory.addEncounter(encounter);
    }

}
