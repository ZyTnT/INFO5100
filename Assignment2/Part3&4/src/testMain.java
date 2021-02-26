import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class testMain {
    public static void main(String args[]) throws ParseException {
        totalSystem totalSystem = new totalSystem();
        totalSystem.getCity().setCityName("Boston");

        System.out.println("Please input 2 communities and 2 houses for each.");
        for (int i = 0; i < 2; i++) {
            Community community = new Community();
            Scanner communityInp = new Scanner(System.in);
            System.out.println("Please input community Name:");
            String communityName = communityInp.nextLine();
            community.setCommunityName(communityName);

            for (int j = 0; j < 2; j++) {
                House house = new House();
                System.out.println("Please input house Address:");
                String houseAddress = communityInp.nextLine();
                house.setHouseAddress(houseAddress);
                community.addHouse(house);
            }
            totalSystem.getCity().addCommunity(community);
        }
        System.out.println("-------------------------------------------------------------");


        System.out.println("Please input 5 person information:");
        for (int i = 0; i < 2; i++) {     //Input patient information to patient directory.
            Person person = new Person();
            Scanner inp = new Scanner(System.in);
            System.out.println("Please input person Name:");
            String name = inp.nextLine();
            System.out.println("Please input person Sex:");
            String sex = inp.nextLine();
            System.out.println("Please input person Age:");
            int age = Integer.parseInt(inp.nextLine());
            System.out.println("Please input person Residence:");
            String residence = inp.nextLine();

            person.setName(name);
            person.setAge(age);
            person.setSex(sex);
            person.setResidence(residence);

            totalSystem.getPersonDirectory().addPersonInfo(person);
        }
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Please create 5 encounters");
        for (int i = 0; i < 2; i++) {   // Input vital signs and update it into patient and doctor directory.
            Encounter encounter = new Encounter();

            Scanner inp = new Scanner(System.in);
            System.out.println("Please input patient Name:");
            String patientName = inp.nextLine();
            System.out.println("Please input patient sex:");
            String patientSex = inp.nextLine();
            System.out.println("Please input patientBirthday");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date patientBirthday = sdf.parse(inp.nextLine());
            System.out.println("Please input encounter Date(yyyy-MM-dd):");
            Date encounterDate = sdf.parse(inp.nextLine());

            System.out.println("Please input patient ageGroup(NewBorn,Infant,Toddler,Preschooler,SchoolAge,Adolescent):");
            String ageGroup = inp.next();
            System.out.println("Please input patient Respiratory Rate:");
            int respiratoryRate = Integer.parseInt(inp.next());
            System.out.println("Please input patient Heart Rate:");
            int heartRate = Integer.parseInt(inp.next());
            System.out.println("Please input patient Blood Pressure:");
            int systolicBloodPressure = Integer.parseInt(inp.next());
            System.out.println("Please input patient Weight in kilos:");
            double weightInKilos = Double.parseDouble(inp.next());
            System.out.println("Please input patient Weight in pounds:");
            double weightInPounds = Double.parseDouble(inp.next());

            encounter.setPatientName(patientName);
            encounter.setPatientSex(patientSex);
            encounter.setPatientBirthday(patientBirthday);
            encounter.setEncounterDate(encounterDate);
            encounter.getVitalSign().setAgeGroup(ageGroup);
            encounter.getVitalSign().setHeartRate(heartRate);
            encounter.getVitalSign().setBloodPressure(systolicBloodPressure);
            encounter.getVitalSign().setWeightKilo(weightInKilos);
            encounter.getVitalSign().setWeightPounds(weightInPounds);
            encounter.getVitalSign().setRespiratoryRate(respiratoryRate);

            encounter.printIsPatientNormal();

            encounter.updateEncounter(totalSystem.getPersonDirectory());
            encounter.updateEncounter(totalSystem.getPatientDirectory());
        }

        System.out.println("All patient name are: ");
        for(PatientInformation p : totalSystem.getPatientDirectory().getPatientDictory()){
            System.out.print(p.getName() + ",");
        }

        System.out.println();
        System.out.println("All person status are:");
        for (Person p : totalSystem.getPersonDirectory().getPersonArrayList()){
            System.out.println(p.getName() + " is patient? " + p.isPatient());
        }
        System.out.println("--------------------------------------------------------");

        totalSystem.getCity().countCommunityPatient("BloodPressure",totalSystem.getPersonDirectory());

    }
}
