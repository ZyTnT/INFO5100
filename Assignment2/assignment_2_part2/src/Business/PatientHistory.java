/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhaozhihan
 */
public class PatientHistory {
    private List<Patient>patientHistory;
    
    public PatientHistory(List<Patient> l){
        this.patientHistory = l;
    }


    public List<Patient> getPatientHistory() {
        return patientHistory;
    }

    
    public void addVitals(Patient patient){
        patientHistory.add(patient);
    }
}
