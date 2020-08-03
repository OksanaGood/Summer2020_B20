package Day_11_Nestedif_Ternary;

public class DaysAndMonths {
    public static void main(String[] args) {
        int month = 5;
        boolean days28 = month == 2;
        boolean days30 = month==4 || month==6 || month==9 || month==11;
        boolean invalid = month < 1 || month >12;
        String result = "";
        if (days28) {
            result = "28 Days";
        } else if (days30) {
            result = "30 Days";
        } else if (invalid) {
            result = "invalid";
        } else {
            result = "31 Days";
        }

        System.out.println(result);

    }
}
