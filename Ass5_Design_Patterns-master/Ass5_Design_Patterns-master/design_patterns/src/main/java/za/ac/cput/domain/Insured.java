package za.ac.cput.domain;

import java.io.Serializable;
import java.util.List;


public class Insured implements Serializable{
    private List<Plan> plans;
    private List<DemographicInfo> demographicInfos;
    private List<Physician> physicianLst;

    private Insured(){}

    public Insured(Builder builder) {
        demographicInfos = builder.demographicInfos;
        plans = builder.plans;
        physicianLst = builder.physicianLst;
    }

    public List<Plan> getPlan() {
        return plans;
    }

    public List<DemographicInfo> getDemographicInfos() {
        return demographicInfos;
    }

    public List<Physician> getPhysicianLst() {
        return physicianLst;
    }

    public static class Builder{
        private List<Plan> plans;
        private List<DemographicInfo> demographicInfos;
        private List<Physician> physicianLst;


        public Builder plans(List<Plan> value)
        {
            this.plans = value;
            return this;
        }
        public Builder demographicInfos(List<DemographicInfo> value)
        {
            this.demographicInfos = value;
            return this;
        }
        public Builder physicianLst(List<Physician> value)
        {
            this.physicianLst = value;
            return this;
        }
        public Builder copy(Insured value)
        {
            this.plans = value.getPlan();
            this.demographicInfos = value.getDemographicInfos();
            this.physicianLst = value.getPhysicianLst();
            return this;
        }
        public Insured build(){return new Insured(this);}

    }

}
