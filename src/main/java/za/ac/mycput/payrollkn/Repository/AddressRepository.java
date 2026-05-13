package za.ac.mycput.payrollkn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.payrollkn.Domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,String> {

    //custom jpa query methods


}
