package Day07_Unary_ShortHand;

public class Devisible_2_3_5 {
    public static void main(String[] args) {

        int number = 10000;  //we can change this number
        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println(number+" is evenly divisibl by 2: "+ divisibleBy2);
        System.out.println(number+" is evenly divisibl by 3: "+ divisibleBy3);
        System.out.println(number+" is evenly divisibl by 5: "+ divisibleBy5);
    }

}
