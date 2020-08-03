package Day_11_Nestedif_Ternary;

public class DaysAndMonths2 {
    public static void main(String[] args) {
        int month = 12;
        boolean validNumber = month >= 1 && month <= 12;
        String result = "";
        boolean days28 = month == 2; //for the months tat has 28 days
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;

        if (validNumber) {
            if (days28) {
                result = "28 Days";
            } else if (days30) {
                result = "30 Days";
            } else {
                result = "31 Days";
            }

            System.out.println(result);
        }
    }
}
