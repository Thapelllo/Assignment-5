package za.ac.cput.domain;

import java.util.List;


public class Dependent extends  Insured{
    private String relationToSubscriber;

    public Dependent(Builder builder, String relationToSubscriber) {
        super(builder);
        this.relationToSubscriber = relationToSubscriber;
    }

    public String getRelationToSubscriber() {
        return relationToSubscriber;
    }

    @Override
    public List<Plan> getPlan() {
        return super.getPlan();
    }

    @Override
    public List<DemographicInfo> getDemographicInfos() {
        return super.getDemographicInfos();
    }

    @Override
    public List<Physician> getPhysicianLst() {
        return super.getPhysicianLst();
    }
}
