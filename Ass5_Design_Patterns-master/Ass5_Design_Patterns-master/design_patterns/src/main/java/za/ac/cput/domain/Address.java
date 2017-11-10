package za.ac.cput.domain;

import java.io.Serializable;

/**
 * Created by IT on 2017/05/30.
 */
public class Address implements Serializable{
    private int streetNumber;
    private String streetName;
    private String town;
    private String city;
    private int zipCode;

    private  Address(){

    }
    public Address(Builder builder){
        streetNumber = builder.streetNumber;
        streetName = builder.streetName;
        town = builder.town;
        city = builder.city;
        zipCode = builder.zipCode;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getTown() {
        return town;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public static class Builder
    {
        private int streetNumber;
        private String streetName;
        private String town;
        private String city;
        private int zipCode;

        public Builder streetNumber(int value)
        {
            this.streetNumber = value;
            return this;
        }
        public Builder streetName(String value)
        {
            this.streetName = value;
            return this;
        }
        public Builder town(String value)
        {
            this.town = value;
            return this;
        }
        public Builder city(String value)
        {
            this.city = value;
            return this;
        }
        public Builder zipCode(int value)
        {
            this.zipCode = value;
            return this;
        }
        public Builder copy(Address value)
        {
            this.streetNumber = value.getStreetNumber();
            this.streetName = value.getStreetName();
            this.town = value.getTown();
            this.city = value.getCity();
            this.zipCode = value.getZipCode();
            return this;
        }
        public Address build(){return new Address(this);}

    }

}
