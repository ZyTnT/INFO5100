import java.util.Date;

public class Encounter {
    private String patientName;
    private String patientSex;
    private java.util.Date encounterDate;
    private VitalSign vitalSign = new VitalSign();
    private java.util.Date patientBirthday;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public VitalSign getVitalSign() {
        return this.vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public java.util.Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public java.util.Date getPatientBirthday() {
        return patientBirthday;
    }

    public void setPatientBirthday(java.util.Date patientBirthday) {
        this.patientBirthday = patientBirthday;
    }

    public Boolean isBloodPressureNormal() {
        Boolean isBloodPressureNormal = true;
        switch (this.vitalSign.getAgeGroup()) {
            case "NewBorn":
                if (this.vitalSign.getBloodPressure() < 50.00 || this.vitalSign.getBloodPressure() > 70.00) {
                    isBloodPressureNormal = false;
                }
                break;

            case "Infant":
                if (this.vitalSign.getBloodPressure() < 70.00 || this.vitalSign.getBloodPressure() > 100.00) {
                    isBloodPressureNormal = false;
                }
                break;

            case "Toddler":
                if (this.vitalSign.getBloodPressure() < 80.00 || this.vitalSign.getBloodPressure() > 110.00) {
                    isBloodPressureNormal = false;
                }

            case "Preschooler":
                if (this.vitalSign.getBloodPressure() < 80.00 || this.vitalSign.getBloodPressure() > 110.00) {
                    isBloodPressureNormal = false;
                }

            case "SchoolAge":
                if (this.vitalSign.getBloodPressure() < 80.00 || this.vitalSign.getBloodPressure() > 120.00) {
                    isBloodPressureNormal = false;
                }

            case "Adolescent":
                if (this.vitalSign.getBloodPressure() < 110.00 || this.vitalSign.getBloodPressure() > 120.00) {
                    isBloodPressureNormal = false;
                }

        }
        return isBloodPressureNormal;
    }

    public Boolean isRespiratoryRateNormal() {
        Boolean isRespiratoryRateNormal = true;
        switch (this.vitalSign.getAgeGroup()) {
            case "NewBorn":
                if (this.vitalSign.getRespiratoryRate() < 30 || this.vitalSign.getRespiratoryRate() > 50) {
                    isRespiratoryRateNormal = false;
                }

            case "Infant":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isRespiratoryRateNormal = false;
                }

            case "Toddler":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isRespiratoryRateNormal = false;
                }

            case "Preschooler":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isRespiratoryRateNormal = false;
                }

            case "SchoolAge":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isRespiratoryRateNormal = false;
                }

            case "Adolescent":
                if (this.vitalSign.getRespiratoryRate() < 12 || this.vitalSign.getRespiratoryRate() > 20) {
                    isRespiratoryRateNormal = false;
                }
        }
        return isRespiratoryRateNormal;
    }

    public Boolean isHeartRateNormal(){
        Boolean isHeartRateNormal = true;
        switch (this.vitalSign.getAgeGroup()){
            case "NewBorn":
                if (this.vitalSign.getHeartRate() < 120 || this.vitalSign.getHeartRate() > 160) {
                    isHeartRateNormal = false;}

            case "Infant":
                if (this.vitalSign.getHeartRate() < 80 || this.vitalSign.getHeartRate() > 140) {
                    isHeartRateNormal = false;}

            case "Toddler":
                if (this.vitalSign.getHeartRate() < 80 || this.vitalSign.getHeartRate() > 130) {
                    isHeartRateNormal = false;}

            case "Preschooler":
                if (this.vitalSign.getHeartRate() < 80 || this.vitalSign.getHeartRate() > 120) {
                    isHeartRateNormal = false;}
                
            case "SchoolAge":
                if (this.vitalSign.getHeartRate() < 70 || this.vitalSign.getHeartRate() > 110) {
                    isHeartRateNormal = false;}
        }
        return isHeartRateNormal;
    }

    public Boolean isWeightKiloNormal() {
        Boolean isWeightKiloNormal = true;
        switch (this.vitalSign.getAgeGroup()) {
            case "NewBorn":
                if (this.vitalSign.getweightKilo() < 2.00 || this.vitalSign.getweightKilo() > 3.00) {
                    isWeightKiloNormal = false;
                }

            case "Infant":
                if (this.vitalSign.getweightKilo() < 4.00 || this.vitalSign.getweightKilo() > 10.00) {
                    isWeightKiloNormal = false;
                }

            case "Toddler":
                if (this.vitalSign.getweightKilo()< 10.00 || this.vitalSign.getweightKilo() > 14.00) {
                    isWeightKiloNormal = false;
                }

            case "Preschooler":
                if (this.vitalSign.getweightKilo() < 14.00 || this.vitalSign.getweightKilo() > 18.00) {
                    isWeightKiloNormal = false;
                }

            case "SchoolAge":
                if (this.vitalSign.getweightKilo() < 20.00 || this.vitalSign.getweightKilo() > 42.00) {
                    isWeightKiloNormal = false;
                }

            case "Adolescent":
                if (this.vitalSign.getweightKilo()< 50.00) {
                    isWeightKiloNormal = false;
                }
        }
        return isWeightKiloNormal;
    }

    public Boolean isWeightPoundsNormal() {
        Boolean isWeightPoundsNormal = true;
        switch (this.vitalSign.getAgeGroup()) {
            case "NewBorn":
                if (this.vitalSign.getWeightPounds() < 4.50 || this.vitalSign.getWeightPounds() > 7.00) {
                    isWeightPoundsNormal = false;
                }

            case "Infant":
                if (this.vitalSign.getWeightPounds() < 9.00 || this.vitalSign.getWeightPounds() > 22.00) {
                    isWeightPoundsNormal = false;
                }

            case "Toddler":
                if (this.vitalSign.getWeightPounds() < 22.00 || this.vitalSign.getWeightPounds() > 31.00) {
                    isWeightPoundsNormal = false;
                }

            case "Preschooler":
                if (this.vitalSign.getWeightPounds() < 31.00 || this.vitalSign.getWeightPounds() > 40.00) {
                    isWeightPoundsNormal = false;
                }

            case "SchoolAge":
                if (this.vitalSign.getWeightPounds() < 41.00 || this.vitalSign.getWeightPounds() > 92.00) {
                    isWeightPoundsNormal = false;
                }

            case "Adolescent":
                if (this.vitalSign.getWeightPounds() < 110.00) {
                    isWeightPoundsNormal = false;
                }
        }
        return isWeightPoundsNormal;
    }

    public void printIsPatientNormal() {
        Boolean isNormal = true;
        switch (this.vitalSign.getAgeGroup()) {
            case "NewBorn":
                if (this.vitalSign.getRespiratoryRate() < 30 || this.vitalSign.getRespiratoryRate() > 50) {
                    isNormal = false;
                    System.out.println("The vitalSign's respiratory rate is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getHeartRate() < 120 || this.vitalSign.getHeartRate() > 160) {
                    isNormal = false;
                    System.out.println("The vitalSign's heart rate is abnormal.  Abnormal value is : " + this.vitalSign.getHeartRate());
                }
                if (this.vitalSign.getRespiratoryRate() < 50.00 || this.vitalSign.getRespiratoryRate() > 70.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's systolic blood pressure is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getweightKilo() < 2.00 || this.vitalSign.getweightKilo() > 3.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in kilos is abnormal.  Abnormal value is : " + this.vitalSign.getweightKilo());
                }
                if (this.vitalSign.getWeightPounds() < 4.50 || this.vitalSign.getWeightPounds() > 7.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in pounds is abnormal.  Abnormal value is : " + this.vitalSign.getWeightPounds());
                }
                break;
            case "Infant":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isNormal = false;
                    System.out.println("The vitalSign's respiratory rate is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getHeartRate() < 80 || this.vitalSign.getHeartRate() > 140) {
                    isNormal = false;
                    System.out.println("The vitalSign's heart rate is abnormal.  Abnormal value is : " + this.vitalSign.getHeartRate());
                }
                if (this.vitalSign.getRespiratoryRate() < 70.00 || this.vitalSign.getRespiratoryRate() > 100.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's systolic blood pressure is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getweightKilo() < 4.00 || this.vitalSign.getweightKilo() > 10.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in kilos is abnormal.  Abnormal value is : " + this.vitalSign.getweightKilo());
                }
                if (this.vitalSign.getWeightPounds() < 9.00 || this.vitalSign.getWeightPounds() > 22.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in pounds is abnormal.  Abnormal value is : " + this.vitalSign.getWeightPounds());
                }
                break;
            case "Toddler":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isNormal = false;
                    System.out.println("The vitalSign's respiratory rate is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getHeartRate() < 80 || this.vitalSign.getHeartRate() > 130) {
                    isNormal = false;
                    System.out.println("The vitalSign's heart rate is abnormal.  Abnormal value is : " + this.vitalSign.getHeartRate());
                }
                if (this.vitalSign.getRespiratoryRate() < 80.00 || this.vitalSign.getRespiratoryRate() > 110.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's systolic blood pressure is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getweightKilo() < 10.00 || this.vitalSign.getweightKilo() > 14.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in kilos is abnormal.  Abnormal value is : " + this.vitalSign.getweightKilo());
                }
                if (this.vitalSign.getWeightPounds() < 22.00 || this.vitalSign.getWeightPounds() > 31.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in pounds is abnormal.  Abnormal value is : " + this.vitalSign.getWeightPounds());
                }
                break;
            case "Preschooler":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isNormal = false;
                    System.out.println("The vitalSign's respiratory rate is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getHeartRate() < 80 || this.vitalSign.getHeartRate() > 120) {
                    isNormal = false;
                    System.out.println("The vitalSign's heart rate is abnormal.  Abnormal value is : " + this.vitalSign.getHeartRate());
                }
                if (this.vitalSign.getRespiratoryRate() < 80.00 || this.vitalSign.getRespiratoryRate() > 110.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's systolic blood pressure is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getweightKilo() < 14.00 || this.vitalSign.getweightKilo() > 18.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in kilos is abnormal.  Abnormal value is : " + this.vitalSign.getweightKilo());
                }
                if (this.vitalSign.getWeightPounds() < 31.00 || this.vitalSign.getWeightPounds() > 40.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in pounds is abnormal.  Abnormal value is : " + this.vitalSign.getWeightPounds());
                }
                break;
            case "SchoolAge":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isNormal = false;
                    System.out.println("The vitalSign's respiratory rate is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getHeartRate() < 70 || this.vitalSign.getHeartRate() > 110) {
                    isNormal = false;
                    System.out.println("The vitalSign's heart rate is abnormal.  Abnormal value is : " + this.vitalSign.getHeartRate());
                }
                if (this.vitalSign.getRespiratoryRate() < 80.00 || this.vitalSign.getRespiratoryRate() > 120.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's systolic blood pressure is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getweightKilo() < 20.00 || this.vitalSign.getweightKilo() > 42.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in kilos is abnormal.  Abnormal value is : " + this.vitalSign.getweightKilo());
                }
                if (this.vitalSign.getWeightPounds() < 41.00 || this.vitalSign.getWeightPounds() > 92.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in pounds is abnormal.  Abnormal value is : " + this.vitalSign.getWeightPounds());
                }
                break;
            case "Adolescent":
                if (this.vitalSign.getRespiratoryRate() < 12 || this.vitalSign.getRespiratoryRate() > 20) {
                    isNormal = false;
                    System.out.println("The vitalSign's respiratory rate is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getHeartRate() < 55 || this.vitalSign.getHeartRate() > 105) {
                    isNormal = false;
                    System.out.println("The vitalSign's heart rate is abnormal.  Abnormal value is : " + this.vitalSign.getHeartRate());
                }
                if (this.vitalSign.getRespiratoryRate() < 110.00 || this.vitalSign.getRespiratoryRate() > 120.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's systolic blood pressure is abnormal.  Abnormal value is : " + this.vitalSign.getRespiratoryRate());
                }
                if (this.vitalSign.getweightKilo() < 50.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in kilos is abnormal.  Abnormal value is : " + this.vitalSign.getweightKilo());
                }
                if (this.vitalSign.getWeightPounds() < 110.00) {
                    isNormal = false;
                    System.out.println("The vitalSign's weight in pounds is abnormal.  Abnormal value is : " + this.vitalSign.getWeightPounds());
                }
                break;
        }
    }

    public Boolean isPatientNormal() {
        Boolean isNormal = true;
        switch (this.vitalSign.getAgeGroup()) {
            case "NewBorn":
                if (this.vitalSign.getRespiratoryRate() < 30 || this.vitalSign.getRespiratoryRate() > 50) {
                    isNormal = false;
                }
                if (this.vitalSign.getHeartRate() < 120 || this.vitalSign.getHeartRate() > 160) {
                    isNormal = false;
                }
                if (this.vitalSign.getRespiratoryRate() < 50.00 || this.vitalSign.getRespiratoryRate() > 70.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getweightKilo() < 2.00 || this.vitalSign.getweightKilo() > 3.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getWeightPounds() < 4.50 || this.vitalSign.getWeightPounds() > 7.00) {
                    isNormal = false;
                }
                break;
            case "Infant":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isNormal = false;
                }
                if (this.vitalSign.getHeartRate() < 80 || this.vitalSign.getHeartRate() > 140) {
                    isNormal = false;
                }
                if (this.vitalSign.getRespiratoryRate() < 70.00 || this.vitalSign.getRespiratoryRate() > 100.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getweightKilo() < 4.00 || this.vitalSign.getweightKilo() > 10.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getWeightPounds() < 9.00 || this.vitalSign.getWeightPounds() > 22.00) {
                    isNormal = false;
                }
                break;
            case "Toddler":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isNormal = false;
                }
                if (this.vitalSign.getHeartRate() < 80 || this.vitalSign.getHeartRate() > 130) {
                    isNormal = false;
                }
                if (this.vitalSign.getRespiratoryRate() < 80.00 || this.vitalSign.getRespiratoryRate() > 110.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getweightKilo() < 10.00 || this.vitalSign.getweightKilo() > 14.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getWeightPounds() < 22.00 || this.vitalSign.getWeightPounds() > 31.00) {
                    isNormal = false;
                }
                break;
            case "Preschooler":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isNormal = false;
                }
                if (this.vitalSign.getHeartRate() < 80 || this.vitalSign.getHeartRate() > 120) {
                    isNormal = false;
                }
                if (this.vitalSign.getRespiratoryRate() < 80.00 || this.vitalSign.getRespiratoryRate() > 110.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getweightKilo() < 14.00 || this.vitalSign.getweightKilo() > 18.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getWeightPounds() < 31.00 || this.vitalSign.getWeightPounds() > 40.00) {
                    isNormal = false;
                }
                break;
            case "SchoolAge":
                if (this.vitalSign.getRespiratoryRate() < 20 || this.vitalSign.getRespiratoryRate() > 30) {
                    isNormal = false;
                }
                if (this.vitalSign.getHeartRate() < 70 || this.vitalSign.getHeartRate() > 110) {
                    isNormal = false;
                }
                if (this.vitalSign.getRespiratoryRate() < 80.00 || this.vitalSign.getRespiratoryRate() > 120.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getweightKilo() < 20.00 || this.vitalSign.getweightKilo() > 42.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getWeightPounds() < 41.00 || this.vitalSign.getWeightPounds() > 92.00) {
                    isNormal = false;
                }
                break;
            case "Adolescent":
                if (this.vitalSign.getRespiratoryRate() < 12 || this.vitalSign.getRespiratoryRate() > 20) {
                    isNormal = false;
                }
                if (this.vitalSign.getHeartRate() < 55 || this.vitalSign.getHeartRate() > 105) {
                    isNormal = false;
                }
                if (this.vitalSign.getRespiratoryRate() < 110.00 || this.vitalSign.getRespiratoryRate() > 120.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getweightKilo() < 50.00) {
                    isNormal = false;
                }
                if (this.vitalSign.getWeightPounds() < 110.00) {
                    isNormal = false;
                }
                break;
        }
        return isNormal;
    }

    public void updateEncounter(PatientDirectory patientDirectory){
        if(!this.isPatientNormal()){
            Boolean flag = false;
            for(PatientInformation patientInformation: patientDirectory.getPatientDictory()){
                if (patientInformation.getName().equals(this.patientName)){
                    patientInformation.updateEncounterHistory(this);
                    flag = true;
                }
            }
            if (!flag){
                PatientInformation newPatient = new PatientInformation(this);
                patientDirectory.addPatientInfo(newPatient);
            }
        }




    }

    public void updateEncounter(PersonDirectory personDirectory){
        if(!this.isPatientNormal()){
            for(Person person: personDirectory.getPersonArrayList()){
                if (person.getName().equals(this.patientName)){
                    person.becomePatient(this);
                }
            }

        }

    }

}


