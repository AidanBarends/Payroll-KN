package za.ac.mycput.payrollkn.Domain;

public  class Person {

    private String firstName;
    private String lastName;

    Person(){}

    Person(Builder builder){

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{

        private String firstName;
        private String lastName;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Person person){
            this.firstName = person.getFirstName();
            this.lastName = person.getLastName();

            return this;
        }

        public Person build(){
            return new Person(this);
        }


    }
}
