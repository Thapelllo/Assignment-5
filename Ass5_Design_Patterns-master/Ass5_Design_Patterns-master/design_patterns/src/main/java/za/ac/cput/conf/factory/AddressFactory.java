package za.ac.cput.conf.factory;

import za.ac.cput.domain.Address;

/**
 * Created by LILO on 2016/04/07.
 */
public interface AddressFactory {
     Address createAddress(int streetNumber,String streetName,String town,String city,int zipCode);
}
