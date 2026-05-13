package za.ac.mycput.payrollkn.Controller;


//use resttemplate
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import za.ac.mycput.payrollkn.Domain.Employee;
import za.ac.mycput.payrollkn.Factory.EmployeeFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EmployeeControllerTest {

    @Autowired
    private EmployeeController employeeController;

    private Employee employee;

    @BeforeAll
    void setup() {
        employee = EmployeeFactory.createEmployee(
                "008",
                "James",
                "Smith",
                "james@outlook.com",
                LocalDate.parse("2000-05-23")
        );
    }


    @Test
    @Commit
    void a_create() {
        Employee created = employeeController.create(employee);
        assertNotNull(created);
        System.out.println("Employee created successfully " + created);
    }

    @Test
    void b_getAll() {
        assertNotNull(employeeController.getAll());
        System.out.println("Employee list successfully " + employeeController.getAll());
    }

    @Test
    void c_read() {
        Employee read = employeeController.read(employee.getEmpNum());
        assertNotNull(read);
        System.out.println("Employee read successfully " + read);
    }

    @Test
    void d_update() {
        Employee updated = new Employee.Builder()
                .copy(employee)
                .setFirstName("Louvi")
                .build();
        Employee result = employeeController.update(updated);
        assertNotNull(result);
        System.out.println("Employee updated successfully " + result);
    }

    @Test
    void e_delete() {
        boolean deleted = employeeController.delete(employee.getEmpNum());
        assertTrue(deleted);
        System.out.println("Employee deleted successfully " + deleted);
    }
}



