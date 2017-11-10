package za.ac.cput.domain;

import java.io.Serializable;


public class Coverage implements Serializable {

    public boolean isCovered(){
        System.out.print("Coverage: Validating health insurance claim.....\n");
        return true;

    }
    public static class Builder{

        public Coverage build(){return  new Coverage();}
    }
}
