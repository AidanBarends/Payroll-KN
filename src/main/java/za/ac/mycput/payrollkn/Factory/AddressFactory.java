package za.ac.mycput.payrollkn.Factory;

import za.ac.mycput.payrollkn.Domain.Address;
import za.ac.mycput.payrollkn.Util.Helper;

public class AddressFactory {

    public static Address createAddress(String streetNum,String streetName, String suburb,String city, int postalCode) {
        if(Helper.isNullOrEmpty(streetNum) ||
                Helper.isNullOrEmpty(streetName) ||
                Helper.isNullOrEmpty(suburb) ||
                Helper.isNullOrEmpty(city) ||
                !Helper.isValidPostalCode(postalCode)) {
            return null;
        }



        return new Address.Builder()
                .setStreetNum(streetNum)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setPostalCode(postalCode)
                .build();

    }
}
