package za.ac.cput.domain;

import java.io.Serializable;


public class DemographicInfo implements Serializable{

    private int age;
    private String sex;
    private String maritalStatus;
    private String occupation;
    private double salary;
    private Address address;

    private DemographicInfo() {
    }
    public DemographicInfo(Builder builder)
    {
        age = builder.age;
        sex = builder.sex;
        maritalStatus = builder.maritalStatus;
        occupation = builder.occupation;
        salary = builder.salary;
        address = builder.address;
    }
    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    public static class Builder
    {
        private int age;
        private String sex;
        private String maritalStatus;
        private String occupation;
        private double salary;
        private Address address;

        public Builder age(int value)
        {
            this.age = value;
            return this;
        }

        public Builder sex(String value)
        {
            this.sex = value;
            return this;
        }

        public Builder maritalStatus(String value)
        {
            this.maritalStatus = value;
            return this;
        }

        public Builder occupation(String value)
        {
            this.occupation = value;
            return this;
        }

        public Builder salary(double value)
        {
            this.salary = value;
            return this;
        }

        public Builder address(Address value)
        {
            this.address = value;
            return this;
        }

        public Builder copy(DemographicInfo value)
        {
            this.age = value.getAge();
            this.sex = value.getSex();
            this.maritalStatus = value.getMaritalStatus();
            this.occupation = value.getOccupation();
            this.salary = value.getSalary();
            this.address = value.getAddress();
            return this;
        }

        public DemographicInfo build(){return new DemographicInfo(this);}
    }
}
