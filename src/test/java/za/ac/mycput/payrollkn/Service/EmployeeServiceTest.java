package za.ac.mycput.payrollkn.Service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import za.ac.mycput.payrollkn.Domain.Employee;
import za.ac.mycput.payrollkn.Factory.EmployeeFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class EmployeeServiceTest {

    @Autowired
    private EmployeeService service;
    private Employee employee;

    @BeforeAll
    void setup() {
        employee     = EmployeeFactory.createEmployee(
                "007",
                "Aidan",
                "Barends",
                "aianbarends@cput.ac.za",
                LocalDate.parse("2004-11-10"));

    }

    @Test
    void a_getAll() {
        System.out.println(service.getAll());

    }

    @Test
    @Commit
    void b_create() {
        Employee created = service.create(employee);
        assertNotNull(created);
        System.out.println("Employee created: " + created);
    }

    @Test
    void c_read() {
        Employee read = service.read(employee.getEmpNum());
        assertNotNull(read);
        System.out.println("Employee read: " + read);
    }

    @Test
    void d_update() {
        Employee newEmployee = new Employee.Builder().copy(employee).setFirstName("Adrian").build();
        Employee updated = service.update(newEmployee);
        assertNotNull(updated);
        System.out.println("Employee updated: " + updated);
    }

    @Test
    void e_delete() {
    }
}