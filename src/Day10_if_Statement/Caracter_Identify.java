package Day10_if_Statement;

public class Caracter_Identify {

    public static void main(String[] args) {
        char character = 'A';
        //           math:        65<= characters <= 90         ||  97<= characters <= 122
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        //                                  upper case letters  ||  lower case letters
        if (isAlphabetic == true) {
            System.out.println(character + " is Alphabetic");
        } else {
            if (!isAlphabetic == false) {
                System.out.println(character + " is not Alphabetic");
            }
        }


    }
}



