package Day_11_Nestedif_Ternary;

public class DaysInMonth {

    /*  write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12     */
    public static void main(String[] args) {

        int month = 3; //(1-12)
        boolean days28 = month == 2; //for the months tat has 28 days
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;

        boolean invalid = month < 1 || month > 12;

        String result = "";

        if (days28) {
            result = "28 days";
        } else if (days30) {
            result = "30 days";
        } else if (invalid) {
            result = "invalid";
        } else {
            result = "31 days";
        }
        System.out.println(result);
    }

}