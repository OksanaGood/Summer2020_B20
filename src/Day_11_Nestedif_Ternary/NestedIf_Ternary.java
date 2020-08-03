package Day_11_Nestedif_Ternary;

public class NestedIf_Ternary {
   /*   90-100  */
    public static void main(String[] args) {
        int score = 60;
        String result = "";
        if (score >= 0 && score <= 100) { //if its true ==>
            // if its fail => else =>result "Invalid"
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {    //&& score <90);
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }

        } else {
            result = "Invalid";

            System.out.println(result);
        }


        }
    }
