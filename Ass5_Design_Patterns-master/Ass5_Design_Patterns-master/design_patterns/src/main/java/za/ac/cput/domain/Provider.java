package za.ac.cput.domain;

import java.io.Serializable;
import java.util.List;


public class Provider implements Serializable{
    private List<DemographicInfo> demographicInfoList;
    private Payer payer;

    private Provider(){

    }
    public Provider(Builder builder) {
        demographicInfoList = builder.demographicInfoList;
        payer = builder.payer;
    }

    public List<DemographicInfo> getDemographicInfoList() {
        return demographicInfoList;
    }

    public Payer getPayer() {
        return payer;
    }

    public class Builder{
        private List<DemographicInfo> demographicInfoList;
        private Payer payer;

        public Builder demographicInfoList(List<DemographicInfo> value){
            this.demographicInfoList = value;
            return this;
        }
        public Builder payer(Payer value){
            this.payer = value;
            return this;
        }
        public Builder copy(Provider value){
            this.demographicInfoList = value.getDemographicInfoList();
            this.payer = value.getPayer();
            return this;
        }
        public Provider build(){return new Provider(this);}
    }
}
