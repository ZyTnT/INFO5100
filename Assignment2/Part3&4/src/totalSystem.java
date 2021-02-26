public class totalSystem {
    private PatientDirectory patientDirectory = new PatientDirectory();
    private PersonDirectory personDirectory = new PersonDirectory();
    private City city = new City();

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }



}
