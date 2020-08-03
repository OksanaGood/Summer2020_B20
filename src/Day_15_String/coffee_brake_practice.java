package Day_15_String;

public class coffee_brake_practice {
        public static void main(String[] args) {
            String name = "My cat is terrible";
            //             0123456789.......18

            // charAt(index):
            char ch1 = name.charAt(0); //M
            System.out.println(ch1);

            // length() ==> int
            int l = name.length();

            // last index: length of String - 1
            int lastIndexNumber = name.length() - 1;


            char lastChar = name.charAt(lastIndexNumber);
            System.out.println(lastChar);


        }

    }

