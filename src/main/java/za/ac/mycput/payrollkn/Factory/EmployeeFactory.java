package za.ac.mycput.payrollkn.Factory;

import za.ac.mycput.payrollkn.Domain.Employee;
import za.ac.mycput.payrollkn.Util.Helper;

import java.time.LocalDate;

public class EmployeeFactory {

    public static Employee createEmployee(String empNum, String firstName, String lastName, String email, LocalDate DOB){
        if(Helper.isNullOrEmpty(empNum)
                || Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)){
            return null;
        }
        if(!Helper.isValidEmail(email)){
            return null;
        }

        if(!Helper.isValidDate(DOB)){
            return null;
        }

        return new Employee.Builder()
                .setEmpNum(empNum)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setDOB(DOB)
                .build();

    }

    public static Employee createEmployee(String empNum, String firstName, String lastName){
        if(Helper.isNullOrEmpty(empNum) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)){
            return null;
        }

        return new Employee.Builder()
                .setEmpNum(empNum)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }
}
