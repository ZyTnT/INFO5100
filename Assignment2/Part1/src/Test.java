import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String args[]) throws ParseException {
        Patient patient = new Patient();
        patient.setAgeGroup(Test.ageGroupChange("2005-05-12"));
        patient.setRespiratoryRate(13);
        patient.setHeartRate(100);
        patient.setBloodPressure(110);
        patient.setWeightKilo(100);
        patient.setWeightPounds(200.5);



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

}
