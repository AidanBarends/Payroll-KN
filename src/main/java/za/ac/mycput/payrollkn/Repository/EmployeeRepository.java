package za.ac.mycput.payrollkn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.payrollkn.Domain.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {

    Employee findByEmail(String email);
    List<Employee> findByLastName(String lastName);


}
