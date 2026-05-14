package za.ac.mycput.payrollkn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mycput.payrollkn.Domain.Address;
import za.ac.mycput.payrollkn.Repository.AddressRepository;

import java.util.List;

@Service
public class AddressService implements IAddressService {

    private AddressRepository addressRepository;

    @Autowired
    AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    public Address create(Address address) {
        return addressRepository.save(address);
    }

    public Address read(Integer postalCode){
        return this.addressRepository.findById(postalCode).get();
    }

    public Address update(Address address){
        return this.addressRepository.save(address);
    }

    public boolean delete(Integer postalCode){
        this.addressRepository.deleteById(postalCode);
        return true;

    }

    @Override
    public List<Address> getAll() {
        return this.addressRepository.findAll();
    }
}
