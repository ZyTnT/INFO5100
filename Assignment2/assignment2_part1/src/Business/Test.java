/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author zhaozhihan
 */


public class Test{
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String args[]) throws ParseException{
        Patient patient = new Patient();
        patient.setAgeGroup(Test.ageGroupChange("2005-05-12"));
        patient.setRespiratoryRate(13);
        patient.setHeartRate(100);
        patient.setSystolicBloodPressure(110);
        patient.setWeightInKilos(100);
        patient.setWeightInPounds(200.5);
        
        

        Boolean bl = Test.isPatientNormal(patient);
        System.out.println(bl);
    }
    public static String ageGroupChange(String birthDate) throws ParseException{
        String ageGroup = "";
        Calendar ldt = Calendar.getInstance();
        String date = sdf.format(ldt.getTime());
        
        long monthday = Test.getMonthDiff(birthDate, date);
        if(monthday<1){
           ageGroup = "NewBorn";
 
        }else if(monthday >= 1 && monthday < 12 ){
            ageGroup = "InFant";
            
        }else if(monthday >= 12 && monthday < 36 ){
            ageGroup = "Toddler";
        
        }else if(monthday >= 36 && monthday < 72 ){
            ageGroup = "Preschooler";
            
        }else if(monthday >= 72 && monthday < 156 ){
            ageGroup = "SchoolAge";
            
        }else if(monthday >= 156){
            ageGroup = "Adolescent";
            
        }
        return ageGroup;
       
    }
    
    public static long getMonthDiff(String startDate, String endDate) throws ParseException {
        long monthday;
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate1 = fmt.parse(startDate);
        Calendar starCal = Calendar.getInstance();
        starCal.setTime(startDate1);
        int sYear = starCal.get(Calendar.YEAR);
        int sMonth = starCal.get(Calendar.MONTH);
        int sDay = starCal.get(Calendar.DAY_OF_MONTH);
        Date endDate1 = fmt.parse(endDate);
        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate1);
        int eYear = endCal.get(Calendar.YEAR);
        int eMonth = endCal.get(Calendar.MONTH);
        int eDay = endCal.get(Calendar.DAY_OF_MONTH);
        monthday = ((eYear - sYear) * 12 + (eMonth - sMonth));
        if (sDay < eDay) {
            monthday = monthday + 1;
        }
        return monthday;
    }


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