package za.ac.cput.conf.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.DemographicInfo;

/**
 * Created by LILO on 2016/04/07.
 */
public interface DemographicInfoFactory
{
     DemographicInfo createDemograhicInfo(int age, String sex, String maritalStatus,
                                                String occupation, double salary, Address address);
}
