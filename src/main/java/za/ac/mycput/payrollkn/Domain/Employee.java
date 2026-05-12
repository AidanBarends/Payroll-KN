package za.ac.mycput.payrollkn.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    private String empNum;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate DOB;

    protected Employee(){}

    private Employee (Builder builder){
        this.empNum = builder.empNum;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.DOB = builder.DOB;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNum='" + empNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", DateOfBirth=" + DOB +
                '}';
    }

    public static class Builder{

        private String empNum;
        private String firstName;
        private String lastName;
        private String email;
        private LocalDate DOB;


        public Builder setEmpNum(String empNum) {
            this.empNum = empNum;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDOB(LocalDate DOB ) {
            this.DOB = DOB;
            return this;
        }

        public Builder copy(Employee employee){
            this.empNum = employee.getEmpNum();
            this.firstName = employee.getFirstName();
            this.lastName = employee.getLastName();
            this.email = employee.getEmail();
            this.DOB = employee.getDOB();

            return this;
        }

        public Employee build() {
            return new Employee();
        }
    }
}
