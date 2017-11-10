package za.ac.cput.domain;

import java.util.List;


public class Service {
    private List<Coverage> coverageList;
    private String serviceType;

    private Service(){

    }

    public Service(List<Coverage> coverageList, String serviceType) {
        this.coverageList = coverageList;
        this.serviceType = serviceType;
    }
    /*public Service(Builder builder) {
        coverageList = builder.coverageList;
        serviceType = builder.serviceType;
    }*/

    public List<Coverage> getCoverageList() {
        return coverageList;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void processCover(Coverage coverage){
        if(coverage.isCovered()){
            System.out.print("Service: Valid claim. Currently processing claim for approval...");
        }
    }
   /*public class Builder{
        private List<Coverage> coverageList;
        private String serviceType;


        public Builder coverageList(List<Coverage> value)
        {
            this.coverageList = value;
            return this;
        }
        public Builder serviceType(String value){
            this.serviceType = value;
            return this;
        }
        public Service build(){return new Service(this);}
    }*/
}
