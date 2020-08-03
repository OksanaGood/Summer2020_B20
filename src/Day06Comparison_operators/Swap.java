package Day06Comparison_operators;

public class Swap {
/*Wright a progrsm that can swap two variables
values without using temporary variables */

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = b; // c = 15;

        b = a;   //b = 10
        a = c;   //a = 15

        System.out.println(a);
        System.out.println(b);
    }


}
