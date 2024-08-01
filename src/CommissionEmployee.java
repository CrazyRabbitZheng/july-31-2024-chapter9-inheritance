/**
 * This class is used as superclass
 * @author--Zheng Wang
 */
public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSalesWeekly;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSalesWeekly, double commissionRate){
        if(grossSalesWeekly < 0){
            throw new IllegalArgumentException("Weekly gross sales should be greater than 0");
        }

        if(commissionRate <= 0 || commissionRate >= 1){
            throw new IllegalArgumentException("Commission rate should be greater than 0 and less than 1");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSalesWeekly = grossSalesWeekly;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSalesWeekly(double grossSalesWeekly) {
        if(grossSalesWeekly < 0){
            throw new IllegalArgumentException("Weekly gross sales should be greater than 0");
        }
        this.grossSalesWeekly = grossSalesWeekly;
    }

    public double getGrossSalesWeekly(){
        return grossSalesWeekly;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0 || commissionRate >= 1){
            throw new IllegalArgumentException("Commission rate should be greater than 0 and less than 1");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public double earnings(){
        return commissionRate * grossSalesWeekly;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f","commission employee", firstName, lastName,
                "social security number",socialSecurityNumber,
                "weekly gross sales",grossSalesWeekly,
                "commission rate",commissionRate);
    }
}
