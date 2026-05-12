package za.ac.mycput.payrollkn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mycput.payrollkn.Domain.Employee;
import za.ac.mycput.payrollkn.Repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    //create a repo object to work w db and jpa methods
    private EmployeeRepository employeeRepository;

    //autowired - auto calling it constructor

    @Autowired
    EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return List.of();
    }

    @Override
    public Employee create(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee read(String Id) {
        return this.employeeRepository.findById(Id).get();
    }

    @Override
    public Employee update(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public boolean delete(String Id) {
        this.employeeRepository.deleteById(Id);
        return true;
    }
}
