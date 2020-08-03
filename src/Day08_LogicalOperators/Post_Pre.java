package Day08_LogicalOperators;

public class Post_Pre {
    public static void main(String[] args) {

        int a = 200;
        int b = -a++ + - --a * a--%2;
        //  b = -200 -200 * 200 %2;
        //  b = -200-40000%;
        //  b = -200-0 =-200;

        System.out.println(b); //-200
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x /y;

        // z = 300 + 400 - 300 * 400 + 300 /400;
        // z = 300 + 400 - 120000 + 300 / 400 (0.75);
        // z = 300 + 400 - 120000 + 0;
        // z = -119300;
        System.out.println(z); //

    }

}
