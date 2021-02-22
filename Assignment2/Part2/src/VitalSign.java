public class VitalSign {
    private String name;
    private String birthday;
    private String ageGroup;
    private int respiratoryRate;
    private int heartRate;
    private double systolicBloodPressure;
    private double weightKilo;
    private double weightPounds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

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

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(double systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getweightKilo() {
        return weightKilo;
    }

    public void setweightKilo(double weightKilo) {
        this.weightKilo = weightKilo;
    }

    public double getweightPounds() {
        return weightPounds;
    }

    public void setweightPounds(double weightPounds) {
        this.weightPounds = weightPounds;
    }


    public Boolean isVitalSignNormal(VitalSign vitalsign, String check ){
        Boolean isVitalSignNormal = true;
        if (check.equalsIgnoreCase("respiratoryrate")){
            if(vitalsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vitalsign.getRespiratoryRate()>=30&&vitalsign.getRespiratoryRate()<=50) isVitalSignNormal = true;
                else isVitalSignNormal=false;
            }
            else if (vitalsign.getAgeGroup()=="Infant") {
                System.out.println("Patient age group: Infant");
                if (vitalsign.getRespiratoryRate()>=20&&vitalsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Toddler") {
                System.out.println("Patient age group: Toddler");
                if (vitalsign.getRespiratoryRate()>=20&&vitalsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Preschooler") {
                System.out.println("Patient age group: Preschooler");
                if (vitalsign.getRespiratoryRate()>=20&&vitalsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="School Age") {
                System.out.println("Patient age group: School Age");
                if (vitalsign.getRespiratoryRate()>=20&&vitalsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Adolescent") {
                System.out.println("Patient age group: Adolescent");
                if (vitalsign.getRespiratoryRate()>=20&&vitalsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else System.out.println("wrong!");
        }

        if (check.equalsIgnoreCase("heartrate")){
            if(vitalsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vitalsign.getHeartRate()>=120&&vitalsign.getHeartRate()<=160) isVitalSignNormal = true;
                else isVitalSignNormal=false;
            }
            else if (vitalsign.getAgeGroup()=="Infant") {
                System.out.println("Patient age group: Infant");
                if (vitalsign.getHeartRate()>=80&&vitalsign.getHeartRate()<=140) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Toddler") {
                System.out.println("Patient age group: Toddler");
                if (vitalsign.getHeartRate()>=80&&vitalsign.getHeartRate()<=130) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Preschooler") {
                System.out.println("Patient age group: Preschooler");
                if (vitalsign.getHeartRate()>=80&&vitalsign.getHeartRate()<=120) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="School Age") {
                System.out.println("Patient age group: School Age");
                if (vitalsign.getHeartRate()>=70&&vitalsign.getHeartRate()<=110) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Adolescent") {
                System.out.println("Patient age group: Adolescent");
                if (vitalsign.getHeartRate()>=55&&vitalsign.getHeartRate()<=105) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else System.out.println("wrong!");
        }

        if (check.equalsIgnoreCase("bloodpressure")){
            if(vitalsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vitalsign.getSystolicBloodPressure()>=50&&vitalsign.getSystolicBloodPressure()<=70) isVitalSignNormal = true;
                else isVitalSignNormal=false;
            }
            else if (vitalsign.getAgeGroup()=="Infant") {
                System.out.println("Patient age group: Infant");
                if (vitalsign.getSystolicBloodPressure()>=70&&vitalsign.getSystolicBloodPressure()<=100) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Toddler") {
                System.out.println("Patient age group: Toddler");
                if (vitalsign.getSystolicBloodPressure()>=80&&vitalsign.getSystolicBloodPressure()<=110) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Preschooler") {
                System.out.println("Patient age group: Preschooler");
                if (vitalsign.getSystolicBloodPressure()>=80&&vitalsign.getSystolicBloodPressure()<=110) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="School Age") {
                System.out.println("Patient age group: School Age");
                if (vitalsign.getSystolicBloodPressure()>=80&&vitalsign.getSystolicBloodPressure()<=120) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Adolescent") {
                System.out.println("Patient age group: Adolescent");
                if (vitalsign.getSystolicBloodPressure()>=110&&vitalsign.getSystolicBloodPressure()<=120) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else System.out.println("wrong!");
        }

        if (check.equalsIgnoreCase("weightinkilo")){
            if(vitalsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vitalsign.getweightKilo()>=2&&vitalsign.getweightKilo()<=3) isVitalSignNormal = true;
                else isVitalSignNormal=false;
            }
            else if (vitalsign.getAgeGroup()=="Infant") {
                System.out.println("Patient age group: Infant");
                if (vitalsign.getweightKilo()>=4&&vitalsign.getweightKilo()<=10) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Toddler") {
                System.out.println("Patient age group: Toddler");
                if (vitalsign.getweightKilo()>=10&&vitalsign.getweightKilo()<=14) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Preschooler") {
                System.out.println("Patient age group: Preschooler");
                if (vitalsign.getweightKilo()>=14&&vitalsign.getweightKilo()<=18) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="School Age") {
                System.out.println("Patient age group: School Age");
                if (vitalsign.getweightKilo()>=20&&vitalsign.getweightKilo()<=42) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Adolescent") {
                System.out.println("Patient age group: Adolescent");
                if (vitalsign.getweightKilo()>=50) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else System.out.println("wrong!");
        }

        if (check.equalsIgnoreCase("weightPounds")){
            if(vitalsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vitalsign.getweightPounds()>=4.5&&vitalsign.getweightPounds()<=7) isVitalSignNormal = true;
                else isVitalSignNormal=false;
            }
            else if (vitalsign.getAgeGroup()=="Infant") {
                System.out.println("Patient age group: Infant");
                if (vitalsign.getweightPounds()>=9&&vitalsign.getweightPounds()<=22) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Toddler") {
                System.out.println("Patient age group: Toddler");
                if (vitalsign.getweightPounds()>=22&&vitalsign.getweightPounds()<=31) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Preschooler") {
                System.out.println("Patient age group: Preschooler");
                if (vitalsign.getweightPounds()>=31&&vitalsign.getweightPounds()<=40) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="School Age") {
                System.out.println("Patient age group: School Age");
                if (vitalsign.getweightPounds()>=41&&vitalsign.getweightPounds()<=92) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else if (vitalsign.getAgeGroup()=="Adolescent") {
                System.out.println("Patient age group: Adolescent");
                if (vitalsign.getweightPounds()>=110) isVitalSignNormal = true;
                else isVitalSignNormal= false;
            }
            else System.out.println("wrong!");
        }
        return isVitalSignNormal;
    }
}
