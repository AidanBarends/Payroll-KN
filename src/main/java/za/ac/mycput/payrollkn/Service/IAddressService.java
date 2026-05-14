package za.ac.mycput.payrollkn.Service;

import za.ac.mycput.payrollkn.Domain.Address;

import java.util.List;

public interface IAddressService extends IService<Address, Integer> {

    List<Address> getAll();
}
