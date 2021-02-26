import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Community {
    private String communityName;
    private List<House> houseList = new ArrayList<>();
    private List<Person> bloodPressurePersonList = new ArrayList<>();
    private List<Person> heartRatePersonList = new ArrayList<>();
    private List<Person> respiratoryRatePersonList = new ArrayList<>();
    private List<Person> weightPoundsPersonList = new ArrayList<>();
    private List<Person> weightKiloPersonList = new ArrayList<>();
    private int patientCount;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public void addHouse(House residenceAddress) {
        houseList.add(residenceAddress);
    }

    public List<Person> getBloodPressurePersonList() {
        return bloodPressurePersonList;
    }

    public void setBloodPressurePersonList(List<Person> bloodPressurePersonList) {
        this.bloodPressurePersonList = bloodPressurePersonList;
    }

    public List<Person> getHeartRatePersonList() {
        return heartRatePersonList;
    }

    public void setHeartRatePersonList(List<Person> heartRatePersonList) {
        this.heartRatePersonList = heartRatePersonList;
    }

    public List<Person> getRespiratoryRatePersonList() {
        return respiratoryRatePersonList;
    }

    public void setRespiratoryRatePersonList(List<Person> respiratoryRatePersonList) {
        this.respiratoryRatePersonList = respiratoryRatePersonList;
    }

    public List<Person> getWeightPoundsPersonList() {
        return weightPoundsPersonList;
    }

    public void setWeightPoundsPersonList(List<Person> weightPoundsPersonList) {
        this.weightPoundsPersonList = weightPoundsPersonList;
    }

    public List<Person> getWeightKiloPersonList() {
        return weightKiloPersonList;
    }

    public void setWeightKiloPersonList(List<Person> weightKiloPersonList) {
        this.weightKiloPersonList = weightKiloPersonList;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void countPatient(PersonDirectory personDirectory, String attribute) {
        for (Person person : personDirectory.getPersonArrayList()) {
            for (House house : this.houseList) {
                if (person.isPatient() & person.getResidence().equals(house.getHouseAddress())) {
                    switch (attribute) {
                        case "BloodPressure":
                            for (Encounter encounter : person.getEncounterHistory().getEncounterHistory()) {
                                if (!encounter.isBloodPressureNormal()) {
                                    this.bloodPressurePersonList.add(person);
                                }
                            }
                            break;

                        case "RespiratoryRate":
                            for (Encounter encounter : person.getEncounterHistory().getEncounterHistory()) {
                                if (!encounter.isRespiratoryRateNormal()) {
                                    this.respiratoryRatePersonList.add(person);
                                }
                            }
                            break;

                        case "HeartRate":
                            for (Encounter encounter : person.getEncounterHistory().getEncounterHistory()) {
                                if (!encounter.isHeartRateNormal()) {
                                    this.heartRatePersonList.add(person);
                                }
                            }
                            break;

                        case "WeightInKilo":
                            for (Encounter encounter : person.getEncounterHistory().getEncounterHistory()) {
                                if (!encounter.isWeightKiloNormal()) {
                                    this.weightKiloPersonList.add(person);
                                }
                            }
                            break;

                        case "WeightInPounds":
                            for (Encounter encounter : person.getEncounterHistory().getEncounterHistory()) {
                                if (!encounter.isWeightPoundsNormal()) {
                                    this.weightPoundsPersonList.add(person);
                                }
                            }
                            break;
                    }

                }
            }
        }

    }

    public void printCount(String attribute) {
        switch (attribute) {
            case "BloodPressure":
                patientCount = bloodPressurePersonList.size();
                System.out.println("The community name is " + this.communityName + ". The BloodPressure patient count is " + this.patientCount);
                break;
            case "HeartRate":
                patientCount = heartRatePersonList.size();
                System.out.println("The community name is " + this.communityName + ". The HeartRate patient count is " + this.patientCount);
                break;
            case "RespiratoryRate":
                patientCount = respiratoryRatePersonList.size();
                System.out.println("The community name is " + this.communityName + ". The RespiratoryRate patient count is " + this.patientCount);
                break;
            case "WeightInKilo":
                patientCount = weightKiloPersonList.size();
                System.out.println("The community name is " + this.communityName + ". The WeightInKilo patient count is " + this.patientCount);
                break;
            case "WeightInPounds":
                patientCount = weightPoundsPersonList.size();
                System.out.println("The community name is " + this.communityName + ". The WeightInPounds patient count is " + this.patientCount);
                break;
        }
    }
}

