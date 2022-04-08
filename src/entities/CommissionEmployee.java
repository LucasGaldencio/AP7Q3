package entities;

public class CommissionEmployee extends Employee {
    private Double commissionRate;

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Double grossSales, Double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales);
        this.commissionRate = commissionRate;
    }

    public Double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return commissionRate * getGrossSales();
    }

    @Override
    public String toString() {
        return "Name: " +
               getFirstName() +
               " " +
               getLastName() +
               ", SSN: " +
               getSocialSecurityNumber() +
               ", gross sales: $ " +
               String.format("%.2f", getGrossSales()) +
               ", commission rate: " +
               String.format("%.2f", commissionRate);
    }
}
