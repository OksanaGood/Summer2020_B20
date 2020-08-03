package Day03Sequences_Variables;
/*
variables: salary,   tax
            100_000  0.28

            TotalTax = salary * tax;
            SalaryAfterTax = salary - totalTax
            100_000     0.28
            100_000 * 0.28 = 28000
            100_000 -28000 = 78000

 */
public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 40000.0; //we can updata this number
        double tax = 0.28;

        double totalTax = salary * tax;//100_000 * 0.28 = 28000
        double salaryAfterTax = salary - totalTax; //72000
        System.out.println(salaryAfterTax);

    }
}
