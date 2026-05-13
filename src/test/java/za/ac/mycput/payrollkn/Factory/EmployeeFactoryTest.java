package za.ac.mycput.payrollkn.Factory;

import org.junit.jupiter.api.*;
import za.ac.mycput.payrollkn.Domain.Employee;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeFactoryTest {

    private static Employee emp1,emp2,emp3;

    @BeforeEach
    void setUp(){
        emp1 = EmployeeFactory.createEmployee(
                "17",
                "Wayne",
                "Barnes",
                "wayne@gmail.com",
                LocalDate.parse("1999-11-15"));

        emp2 = EmployeeFactory.createEmployee(
                "21",
                "Aris",
                "Barends",
                "aris7@gmail.com",
                LocalDate.parse("2006-12-30"));

        emp3 = EmployeeFactory.createEmployee(
                "22",
                "Abdi",
                "Gasiem",
                "gasiemA@gmail.com",
                LocalDate.parse("2004-09-30"));
    }

    @Test
    void a_testEmp1() {
        assertNotNull(emp1);
        System.out.println("Employee created: " + emp1);
    }


    @Test
    void b_testEmp2() {
        assertNotNull(emp2);
        System.out.println("Employee created: " + emp2);
    }
    @Test
    void c_testEmp3() {
        assertNotNull(emp3);
        System.out.println("Employee created: " + emp3);
    }
    @Test
    void d_testInvalidEmployee_fails() {
        Employee invalid = EmployeeFactory.createEmployee(
                "99",
                "Bad",
                "Person",
                "notanemail",     // invalid email - no @ symbol
                LocalDate.parse("2000-01-01"));

        assertNull(invalid);      // Factory should return null
        System.out.println("Correctly returned null for invalid email");
    }
}