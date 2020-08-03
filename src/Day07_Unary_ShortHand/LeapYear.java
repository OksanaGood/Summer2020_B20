package Day07_Unary_ShortHand;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2020;
        boolean result = year%4==0;
        System.out.println(result);

        int year1 = 2021;
        boolean result1 = year1%4==0;
        System.out.println(year1 + " is leap year: " + result1);

        int year2 = 2040;
        boolean result2 = year2%4==0;
        System.out.println(year2 + " is a leap year: " + result2);

        int year3 = 2043;
        boolean result3 = year3%4==0;
        System.out.println("Year "+ year3 + " is a leap year: " + result3);

    }
}
