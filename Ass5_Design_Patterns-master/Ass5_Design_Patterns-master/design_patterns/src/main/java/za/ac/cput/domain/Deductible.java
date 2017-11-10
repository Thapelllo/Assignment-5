package za.ac.cput.domain;

import java.io.Serializable;


public class Deductible implements Serializable{

    public boolean isDeductible(){
        System.out.print("Deductible: Validating health insurance claim.....\n");
        return true;
    }
}
