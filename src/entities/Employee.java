package entities;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Double grossSales;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String socialSecurityNumber, Double grossSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(Double grossSales) {
        this.grossSales = grossSales;
    }
}
