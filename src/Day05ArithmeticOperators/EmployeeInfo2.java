package Day05ArithmeticOperators;

public class EmployeeInfo2 {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Daniel";
        char gender = 'M';
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFultime = true;
        boolean isMarried = false;
        double salary = 120_000.50;
        String fullName = firstName+" "+lastName;

        System.out.println("Employee' full name is: " + fullName);
        System.out.println(fullName +"' gender is: " +gender);
        System.out.println(fullName +"' age is: " +age +" years old");
        System.out.println(fullName +" works at " +companyName);
        System.out.println(fullName +"' Job title is: " + jobTitle);
        System.out.println(fullName +"' salary is $" + salary);
        System.out.println(fullName +"is full time employee: " + isFultime);
        System.out.println(fullName +"is married: " + isMarried);

    }
}
