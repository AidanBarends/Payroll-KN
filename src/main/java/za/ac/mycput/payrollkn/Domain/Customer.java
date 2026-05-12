package za.ac.mycput.payrollkn.Domain;
//Composition using that address class
public class Customer {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private Address address;

    private Customer(){}

    private Customer(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.mobileNumber = builder.mobileNumber;
        this.email = builder.email;
        this.address = builder.address;

    }

    public String getFirstName() {
        return firstName;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Builder{

        private String firstName;
        private String lastName;
        private String mobileNumber;
        private String email;
        private Address address;


        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder mobileNumber(String mobileNumber){
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder address(Address address){
            this.address = address;
            return this;
        }

        public Builder copy(Customer customer){
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.mobileNumber = customer.mobileNumber;
            this.email = customer.email;
            this.address = customer.address;

            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
