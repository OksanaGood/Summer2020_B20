package Day09_IfStatement;

public class Maximum {
    /*write a java program that accepts three numbers and return
    the maximum number (assume that none of them are equal)*/

    public static void main(String[] args) {

        double a = 500;
        double b = 200;
        double c = 1000;

        boolean aIsMax = a > b && a > c;
        //              500>200   500>300
        //               true     true ==> true
        //boolean bIsMax = aIsMax == false && b>c

        boolean bIsMax = b > a && b > c;
        //              200>500 && 200>300

        boolean cIsMax = c > b && c > a;
        // aIsMax ==false && bIsMax --false// one more way
        // !aIsMax && !bIsMax              // one more way
        System.out.println("=======================================");

        double max = 0; //we want ti assign the maximum number to variable max

        if (aIsMax) {
            System.out.println(a);
            max = a;
        }
        if (bIsMax) {
            System.out.println(b);
            max = b;
        }
        if (cIsMax) {
            System.out.println(c);
            max = c;
        }
        System.out.println(max + "is maximum number");
        }


        }

