/**
 * This class is a driver class for CommissionEmployee class
 * @author--Zheng Wang
 */
public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
                "Sue",
                "Jones",
                "222-33-5555", 10000, .06);

        System.out.println("Employee information obtained by get methods: ");
        System.out.printf("%n%s%s %s%n%s%s%n", "Name is ",employee.getFirstName(), employee.getLastName(),"Social security number is ",employee.getSocialSecurityNumber());

        System.out.println(employee);
        System.out.println();

        employee.setCommissionRate(.1);
        System.out.println(employee);

        BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee(
                "James",
                "Smith",
                "020-55-8787",
                20000,
                .3,
                5400);

        System.out.println("\nEmployee information obtained by get methods: ");
        System.out.println(employee2);

    }
}