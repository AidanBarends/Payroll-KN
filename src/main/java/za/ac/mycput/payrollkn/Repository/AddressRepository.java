package za.ac.mycput.payrollkn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.payrollkn.Domain.Address;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

    Address findByPostalCode(int postalCode);
    List<Address> findByStreetName(String streetName);


}
