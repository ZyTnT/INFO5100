/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import java.util.List;

/**
 *
 * @author zhaozhihan
 */
public class Patient{
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

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", ageGroup=" + ageGroup + ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", systolicBloodPressure=" + systolicBloodPressure + ", weightInKilos=" + weightInKilos + ", weightInPounds=" + weightInPounds + '}';
    }

   
    

    
    public Boolean isPatientNormal(Patient patient){
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
                if(patient.getSystolicBloodPressure() < 50.00 || patient.getSystolicBloodPressure() > 70.00){
	    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getSystolicBloodPressure());
                }
	        if(patient.getWeightInKilos() < 2.00 || patient.getWeightInKilos() > 3.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightInKilos());
                }
	        if(patient.getWeightInPounds() < 4.50 || patient.getWeightInPounds() > 7.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightInPounds());
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
                if(patient.getSystolicBloodPressure() < 70.00 || patient.getSystolicBloodPressure() > 100.00){
	    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getSystolicBloodPressure());
                }
	        if(patient.getWeightInKilos() < 4.00 || patient.getWeightInKilos() > 10.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightInKilos());
                }
	        if(patient.getWeightInPounds() < 9.00 || patient.getWeightInPounds() > 22.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightInPounds());
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
                if(patient.getSystolicBloodPressure() < 80.00 || patient.getSystolicBloodPressure() > 110.00){
	    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getSystolicBloodPressure());
                }
	        if(patient.getWeightInKilos() < 10.00 || patient.getWeightInKilos() > 14.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightInKilos());
                }
	        if(patient.getWeightInPounds() < 22.00 || patient.getWeightInPounds() > 31.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightInPounds());
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
                if(patient.getSystolicBloodPressure() < 80.00 || patient.getSystolicBloodPressure() > 110.00){
	    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getSystolicBloodPressure());
                }
	        if(patient.getWeightInKilos() < 14.00 || patient.getWeightInKilos() > 18.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightInKilos());
                }
	        if(patient.getWeightInPounds() < 31.00 || patient.getWeightInPounds() > 40.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightInPounds());
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
                if(patient.getSystolicBloodPressure() < 80.00 || patient.getSystolicBloodPressure() > 120.00){
	    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getSystolicBloodPressure());
                }
	        if(patient.getWeightInKilos() < 20.00 || patient.getWeightInKilos() > 42.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightInKilos());
                }
	        if(patient.getWeightInPounds() < 41.00 || patient.getWeightInPounds() > 92.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightInPounds());
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
                if(patient.getSystolicBloodPressure() < 110.00 || patient.getSystolicBloodPressure() > 120.00){
	    isPatientNormal = false;
                    System.out.println("The patient's systolic blood pressure is abnormal.  Abnormal value is : " + patient.getSystolicBloodPressure());
                }
	        if(patient.getWeightInKilos() < 50.00){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in kilos is abnormal.  Abnormal value is : " + patient.getWeightInKilos());
                }
	        if(patient.getWeightInPounds() < 110.00 ){
	    isPatientNormal = false;
                    System.out.println("The patient's weight in pounds is abnormal.  Abnormal value is : " + patient.getWeightInPounds());
                }
            break;
        }
        return isPatientNormal;
    }

    
}
