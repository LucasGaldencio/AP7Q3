package entities;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private Double baseSalary;

    public BasePlusCommissionEmployee() {
        super();
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Double grossSales, Double commissionRate, Double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
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
               String.format("%.2f", getCommissionRate()) +
               ", base salary: $" +
               String.format("%.2f",baseSalary);
    }
}
