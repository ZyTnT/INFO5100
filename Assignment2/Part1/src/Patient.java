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

    private int respiratoryRate;
    private int bloodPressure;
    private double weightKilo;
    private double weightPounds;
    private int heartRate;

}
