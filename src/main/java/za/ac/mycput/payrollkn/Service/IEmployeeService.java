package za.ac.mycput.payrollkn.Service;

import za.ac.mycput.payrollkn.Domain.Employee;

import java.util.List;

public interface IEmployeeService extends IService <Employee,String> {

    List<Employee> getAll();
}
