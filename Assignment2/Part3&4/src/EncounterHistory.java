import java.util.ArrayList;
import java.util.List;

public class EncounterHistory {
    private List<Encounter> encounterHistory = new ArrayList<>();

    public EncounterHistory(){}
    public EncounterHistory(List<Encounter> l){
        this.encounterHistory = l;
    }

    public List<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void addEncounter (Encounter encounter){
        this.encounterHistory.add(encounter);
    }

    public Boolean isAttributeNormal(String attribute){
        Boolean isNormal = true;

        if (attribute.equals("BloodPressure")){
            for (Encounter encounter : this.encounterHistory){
                if(!encounter.isBloodPressureNormal()){
                    isNormal = false;
                }
            }
        }

        if (attribute.equals("RespiratoryRate")){
            for (Encounter encounter : this.encounterHistory){
                if(!encounter.isRespiratoryRateNormal()){
                    isNormal = false;
                }
            }
        }

        if (attribute.equals("HeartRate")){
            for (Encounter encounter : this.encounterHistory){
                if(!encounter.isHeartRateNormal()){
                    isNormal = false;
                }
            }
        }

        if (attribute.equals("WeightKilo")){
            for (Encounter encounter : this.encounterHistory){
                if(!encounter.isWeightKiloNormal()){
                    isNormal = false;
                }
            }
        }

        if (attribute.equals("WeightPounds")){
            for (Encounter encounter : this.encounterHistory){
                if(!encounter.isWeightPoundsNormal()){
                    isNormal = false;
                }
            }
        }

        return isNormal;
    }


}
