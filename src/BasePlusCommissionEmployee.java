/**
 * This class extends CommissionEmployee and has an instance variable double baseSalary (weekly)
 * @author--Zheng Wang
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(//here subclass constructor has all parameters from the superclass and its own parameter
            String firstName,
            String lastName,
            String socialSecurityNumber,
            double grossSalesWeekly,
            double commissionRate,
            double baseSalary) {
        //next line tells the compiler those parameters are inherited from the superclass
        super(firstName, lastName, socialSecurityNumber, grossSalesWeekly, commissionRate);

        //Now do the data validation for the subclass' own parameter
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(){
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double earnings(){
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%n%s%n%s%n%s%s","Employee information: ",super.toString(),"base salary is ",baseSalary);
    }
}
