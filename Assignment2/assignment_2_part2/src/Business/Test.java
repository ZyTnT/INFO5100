/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author zhaozhihan
 */


public class Test{
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String args[]) throws ParseException{
        List<Patient> l = new ArrayList<>();
        for(int i=0;i<10;i++){
        Scanner inp = new Scanner(System.in);
        System.out.println("Please input patient Name:");
        String name= inp.nextLine();
        System.out.println("Please input patient Birth Date(yyyy-mm-dd):");
        String birthday= inp.next();
        System.out.println("Please input patient Respiratory Rate:");
        int respiratoryRate = Integer.parseInt(inp.next());
        System.out.println("Please input patient Heart Rate:");
        int heartRate = Integer.parseInt(inp.next());
        System.out.println("Please input patient Blood Pressure:");
        double systolicBloodPressure = Double.parseDouble(inp.next());
        System.out.println("Please input patient Weight in kilos:");
        double weightInKilos = Double.parseDouble(inp.next());
        System.out.println("Please input patient Weight in pounds:");
        double weightInPounds = Double.parseDouble(inp.next());
        System.out.println("Please input Vital Sign which you want to check:");
        String check= inp.next();
        
        
        Patient patient = new Patient();
        PatientHistory ph = new PatientHistory(l);
        
        patient.setName(name);
        patient.setAgeGroup(Test.ageGroupChange(birthday));
        patient.setRespiratoryRate(respiratoryRate);
        patient.setHeartRate(heartRate);
        patient.setSystolicBloodPressure(systolicBloodPressure);
        patient.setWeightInKilos(weightInKilos);
        patient.setWeightInPounds(weightInPounds);
        
        ph.addVitals(patient);
        
        
        for(Patient p:ph.getPatientHistory()){
        Boolean bl = p.isPatientNormal(p);
        System.out.println(bl);
        System.out.println("Patient Information");
        }
        for(Patient p:l)
        System.out.println(p);
        System.out.println("---------------------------------------------------");
        }
    }
    //timechange 数据的预处理 把生日转化为以月为单位的年龄
    public static String ageGroupChange(String birthday) throws ParseException{
        String ageGroup = "";
        Calendar ldt = Calendar.getInstance();
        String date = sdf.format(ldt.getTime());
        
        long monthday = Test.getMonthDiff(birthday, date);
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


    
}