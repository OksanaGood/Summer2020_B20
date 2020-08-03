package Day06Comparison_operators;

public class Swap2 {
/*swaping two variables without temporary variables*/

    public static void main(String[] args) {

        int a =10;
        int b =15;

        a = a + b; //a=25; //b=15;
        b = a - b; //b=10, //a=25;
        a = a - b; //a=15; //b=10;


        System.out.println(b);//10
        System.out.println(a);//15

    }
}
