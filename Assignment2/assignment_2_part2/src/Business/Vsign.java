/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author zhaozhihan
 */
public class Vsign {
    private String name;
    private String birthday;
    private String ageGroup;
    private int respiratoryRate;
    private int heartRate;
    private double systolicBloodPressure;
    private double weightInKilos;
    private double weightInPounds;  

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

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    
    
    public Boolean isVitalSignNormal(Vsign vsign, String check ){
        Boolean isVitalSignNormal = true;
        if (check.equalsIgnoreCase("respiratoryrate")){
            if(vsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vsign.getRespiratoryRate()>=30&&vsign.getRespiratoryRate()<=50) isVitalSignNormal = true;
                else isVitalSignNormal=false;
		}
            else if (vsign.getAgeGroup()=="Infant") {
		System.out.println("Patient age group: Infant");
		if (vsign.getRespiratoryRate()>=20&&vsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Toddler") {
		System.out.println("Patient age group: Toddler");
		if (vsign.getRespiratoryRate()>=20&&vsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Preschooler") {
		System.out.println("Patient age group: Preschooler");
		if (vsign.getRespiratoryRate()>=20&&vsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="School Age") {
		System.out.println("Patient age group: School Age");
		if (vsign.getRespiratoryRate()>=20&&vsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else if (vsign.getAgeGroup()=="Adolescent") {
		System.out.println("Patient age group: Adolescent");
		if (vsign.getRespiratoryRate()>=20&&vsign.getRespiratoryRate()<=30) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else System.out.println("wrong!");
        }
        
        if (check.equalsIgnoreCase("heartrate")){
            if(vsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vsign.getHeartRate()>=120&&vsign.getHeartRate()<=160) isVitalSignNormal = true;
                else isVitalSignNormal=false;
		}
            else if (vsign.getAgeGroup()=="Infant") {
		System.out.println("Patient age group: Infant");
		if (vsign.getHeartRate()>=80&&vsign.getHeartRate()<=140) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Toddler") {
		System.out.println("Patient age group: Toddler");
		if (vsign.getHeartRate()>=80&&vsign.getHeartRate()<=130) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Preschooler") {
		System.out.println("Patient age group: Preschooler");
		if (vsign.getHeartRate()>=80&&vsign.getHeartRate()<=120) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="School Age") {
		System.out.println("Patient age group: School Age");
		if (vsign.getHeartRate()>=70&&vsign.getHeartRate()<=110) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else if (vsign.getAgeGroup()=="Adolescent") {
		System.out.println("Patient age group: Adolescent");
		if (vsign.getHeartRate()>=55&&vsign.getHeartRate()<=105) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else System.out.println("wrong!");
        }
        
        if (check.equalsIgnoreCase("bloodpressure")){
            if(vsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vsign.getSystolicBloodPressure()>=50&&vsign.getSystolicBloodPressure()<=70) isVitalSignNormal = true;
                else isVitalSignNormal=false;
		}
            else if (vsign.getAgeGroup()=="Infant") {
		System.out.println("Patient age group: Infant");
		if (vsign.getSystolicBloodPressure()>=70&&vsign.getSystolicBloodPressure()<=100) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Toddler") {
		System.out.println("Patient age group: Toddler");
		if (vsign.getSystolicBloodPressure()>=80&&vsign.getSystolicBloodPressure()<=110) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Preschooler") {
		System.out.println("Patient age group: Preschooler");
		if (vsign.getSystolicBloodPressure()>=80&&vsign.getSystolicBloodPressure()<=110) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="School Age") {
		System.out.println("Patient age group: School Age");
		if (vsign.getSystolicBloodPressure()>=80&&vsign.getSystolicBloodPressure()<=120) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else if (vsign.getAgeGroup()=="Adolescent") {
		System.out.println("Patient age group: Adolescent");
		if (vsign.getSystolicBloodPressure()>=110&&vsign.getSystolicBloodPressure()<=120) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else System.out.println("wrong!");
        }
        
        if (check.equalsIgnoreCase("weightinkilo")){
            if(vsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vsign.getWeightInKilos()>=2&&vsign.getWeightInKilos()<=3) isVitalSignNormal = true;
                else isVitalSignNormal=false;
		}
            else if (vsign.getAgeGroup()=="Infant") {
		System.out.println("Patient age group: Infant");
		if (vsign.getWeightInKilos()>=4&&vsign.getWeightInKilos()<=10) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Toddler") {
		System.out.println("Patient age group: Toddler");
		if (vsign.getWeightInKilos()>=10&&vsign.getWeightInKilos()<=14) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Preschooler") {
		System.out.println("Patient age group: Preschooler");
		if (vsign.getWeightInKilos()>=14&&vsign.getWeightInKilos()<=18) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="School Age") {
		System.out.println("Patient age group: School Age");
		if (vsign.getWeightInKilos()>=20&&vsign.getWeightInKilos()<=42) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else if (vsign.getAgeGroup()=="Adolescent") {
		System.out.println("Patient age group: Adolescent");
		if (vsign.getWeightInKilos()>=50) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else System.out.println("wrong!");
        }
        
        if (check.equalsIgnoreCase("weightinpounds")){
            if(vsign.getAgeGroup()=="New Born"){
                System.out.println("Patient age group: New Born");
                if (vsign.getWeightInPounds()>=4.5&&vsign.getWeightInPounds()<=7) isVitalSignNormal = true;
                else isVitalSignNormal=false;
		}
            else if (vsign.getAgeGroup()=="Infant") {
		System.out.println("Patient age group: Infant");
		if (vsign.getWeightInPounds()>=9&&vsign.getWeightInPounds()<=22) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Toddler") {
		System.out.println("Patient age group: Toddler");
		if (vsign.getWeightInPounds()>=22&&vsign.getWeightInPounds()<=31) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="Preschooler") {
		System.out.println("Patient age group: Preschooler");
		if (vsign.getWeightInPounds()>=31&&vsign.getWeightInPounds()<=40) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
             else if (vsign.getAgeGroup()=="School Age") {
		System.out.println("Patient age group: School Age");
		if (vsign.getWeightInPounds()>=41&&vsign.getWeightInPounds()<=92) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else if (vsign.getAgeGroup()=="Adolescent") {
		System.out.println("Patient age group: Adolescent");
		if (vsign.getWeightInPounds()>=110) isVitalSignNormal = true;
		else isVitalSignNormal= false;
		}
            else System.out.println("wrong!");
        }
        return isVitalSignNormal;  
    }
    
    
}
