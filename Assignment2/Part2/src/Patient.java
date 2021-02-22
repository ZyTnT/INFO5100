public class Patient {
    private String ageGroup;

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeightKilo() {
        return weightKilo;
    }

    public void setWeightKilo(double weightKilo) {
        this.weightKilo = weightKilo;
    }

    public double getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(double weightPounds) {
        this.weightPounds = weightPounds;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    private String name;
    private int respiratoryRate;
    private int bloodPressure;
    private double weightKilo;
    private double weightPounds;
    private int heartRate;

    public static Boolean isPatientNormal(Patient patient){
        Boolean isPatientNormal = true;
        switch (patient.getAgeGroup()){
            case "NewBorn":
                if(patient.getRespiratoryRate() < 30 || patient.getRespiratoryRate() > 50){
                    isPatientNormal = false;
                    System.out.println("The patient's respiratory rate is abnormal.  Abnormal value is : " + patient.getRespiratoryRate());
                }
                if(patient.getHeartRate() < 120 || patient.getHeartRate() > 160){
                    isPatientNormal = false;
                    System.out.println("The patient's heart rate is abnormal.  Abnormal value is : " + patient.getHeartRate());
                }
                if(patient.getBloodPressure() < 50.00 || patient.getBloodPressure() > 70.00){
                    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getBloodPressure());
                }
                if(patient.getWeightKilo() < 2.00 || patient.getWeightKilo() > 3.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightKilo());
                }
                if(patient.getWeightPounds() < 4.50 || patient.getWeightPounds() > 7.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightPounds());
                }
                break;
            case "Infant":
                if(patient.getRespiratoryRate() < 20 || patient.getRespiratoryRate() > 30){
                    isPatientNormal = false;
                    System.out.println("The patient's respiratory rate is abnormal.  Abnormal value is : " + patient.getRespiratoryRate());
                }
                if(patient.getHeartRate() < 80 || patient.getHeartRate() > 140){
                    isPatientNormal = false;
                    System.out.println("The patient's heart rate is abnormal.  Abnormal value is : " + patient.getHeartRate());
                }
                if(patient.getBloodPressure() < 70.00 || patient.getBloodPressure() > 100.00){
                    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getBloodPressure());
                }
                if(patient.getWeightKilo() < 4.00 || patient.getWeightKilo() > 10.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightKilo());
                }
                if(patient.getWeightPounds() < 9.00 || patient.getWeightPounds() > 22.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightPounds());
                }
                break;
            case "Toddler":
                if(patient.getRespiratoryRate() < 20 || patient.getRespiratoryRate() > 30){
                    isPatientNormal = false;
                    System.out.println("The patient's respiratory rate is abnormal.  Abnormal value is : " + patient.getRespiratoryRate());
                }
                if(patient.getHeartRate() < 80 || patient.getHeartRate() > 130){
                    isPatientNormal = false;
                    System.out.println("The patient's heart rate is abnormal.  Abnormal value is : " + patient.getHeartRate());
                }
                if(patient.getBloodPressure() < 80.00 || patient.getBloodPressure() > 110.00){
                    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getBloodPressure());
                }
                if(patient.getWeightKilo() < 10.00 || patient.getWeightKilo() > 14.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightKilo());
                }
                if(patient.getWeightPounds() < 22.00 || patient.getWeightPounds() > 31.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightPounds());
                }
                break;
            case "Preschooler":
                if(patient.getRespiratoryRate() < 20 || patient.getRespiratoryRate() > 30){
                    isPatientNormal = false;
                    System.out.println("The patient's respiratory rate is abnormal.  Abnormal value is : " + patient.getRespiratoryRate());
                }
                if(patient.getHeartRate() < 80 || patient.getHeartRate() > 120){
                    isPatientNormal = false;
                    System.out.println("The patient's heart rate is abnormal.  Abnormal value is : " + patient.getHeartRate());
                }
                if(patient.getBloodPressure() < 80.00 || patient.getBloodPressure() > 110.00){
                    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getBloodPressure());
                }
                if(patient.getWeightKilo() < 14.00 || patient.getWeightKilo() > 18.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightKilo());
                }
                if(patient.getWeightPounds() < 31.00 || patient.getWeightPounds() > 40.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightPounds());
                }
                break;
            case "SchoolAge":
                if(patient.getRespiratoryRate() < 20 || patient.getRespiratoryRate() > 30){
                    isPatientNormal = false;
                    System.out.println("The patient's respiratory rate is abnormal.  Abnormal value is : " + patient.getRespiratoryRate());
                }
                if(patient.getHeartRate() < 70 || patient.getHeartRate() > 110){
                    isPatientNormal = false;
                    System.out.println("The patient's heart rate is abnormal.  Abnormal value is : " + patient.getHeartRate());
                }
                if(patient.getBloodPressure() < 80.00 || patient.getBloodPressure() > 120.00){
                    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getBloodPressure());
                }
                if(patient.getWeightKilo() < 20.00 || patient.getWeightKilo() > 42.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightKilo());
                }
                if(patient.getWeightPounds() < 41.00 || patient.getWeightPounds() > 92.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightPounds());
                }
                break;
            case "Adolescent":
                if(patient.getRespiratoryRate() < 12 || patient.getRespiratoryRate() > 20){
                    isPatientNormal = false;
                    System.out.println("The patient's respiratory rate is abnormal.  Abnormal value is : " + patient.getRespiratoryRate());
                }
                if(patient.getHeartRate() < 55 || patient.getHeartRate() > 105){
                    isPatientNormal = false;
                    System.out.println("The patient's heart rate is abnormal.  Abnormal value is : " + patient.getHeartRate());
                }
                if(patient.getBloodPressure() < 110.00 || patient.getBloodPressure() > 120.00){
                    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getBloodPressure());
                }
                if(patient.getWeightKilo() < 50.00){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightKilo());
                }
                if(patient.getWeightPounds() < 110.00 ){
                    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightPounds());
                }
                break;
        }
        return isPatientNormal;
    }


    public void setName(String name) {
        this.name = name;
    }
}
