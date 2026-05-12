package za.ac.mycput.payrollkn.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private String streetNum;
    private String streetName;
    private String suburb;
    private String city;
    private String postalCode;

    private Address(){}

    private Address(Builder builder){

        this.streetNum = builder.streetNum;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNum='" + streetNum + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static class Builder{

        private String streetNum;
        private String streetName;
        private String suburb;
        private String city;
        private String postalCode;

        public Builder setStreetNum(String streetNum){
            this.streetNum = streetNum;
            return this;
        }

        public Builder setStreetName(String streetName){
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb){
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city){
            this.city = city;
            return this;
        }

        public Builder setPostalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(Address address){
            this.streetNum = address.streetNum;
            this.streetName = address.streetName;
            this.suburb = address.suburb;
            this.city = address.city;
            this.postalCode = address.postalCode;

            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }

    //getter, constructors,builder etc etc
}
