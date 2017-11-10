package za.ac.cput.domain;

import java.util.List;


public class ThirdParty extends Provider {

    public ThirdParty(Builder builder) {
        super(builder);
    }

    @Override
    public List<DemographicInfo> getDemographicInfoList() {
        return super.getDemographicInfoList();
    }

    @Override
    public Payer getPayer() {
        return super.getPayer();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
