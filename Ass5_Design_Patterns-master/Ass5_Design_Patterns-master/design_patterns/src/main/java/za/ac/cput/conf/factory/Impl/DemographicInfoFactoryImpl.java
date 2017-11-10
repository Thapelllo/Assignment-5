package za.ac.cput.conf.factory.Impl;

import za.ac.cput.conf.factory.DemographicInfoFactory;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.DemographicInfo;

/**
 * Created by LILO on 2016/04/07.
 */
public class DemographicInfoFactoryImpl implements DemographicInfoFactory
{
    private static DemographicInfoFactoryImpl demographicInfoFactory = null;

    private DemographicInfoFactoryImpl(){}

    public static  DemographicInfoFactoryImpl getInstance()
    {
        if(demographicInfoFactory == null)
            demographicInfoFactory = new DemographicInfoFactoryImpl();
        return demographicInfoFactory;
    }


    public DemographicInfo createDemograhicInfo(int age, String sex, String maritalStatus,
                                                String occupation, double salary, Address address)
    {
        DemographicInfo demographicInfo = new DemographicInfo.Builder().age(age).sex(sex)
                                                .maritalStatus(maritalStatus).occupation(occupation)
                                                .salary(salary).address(address).build();
        return demographicInfo;
    }
}
