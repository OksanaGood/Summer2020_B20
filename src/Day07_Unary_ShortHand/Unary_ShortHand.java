package Day07_Unary_ShortHand;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class Unary_ShortHand {

    public static void main(String[] args) {
        System.out.println(-1+-10); //11
                    //
        System.out.println(-1-  -10);
                    //-11+10 =-1
        //verify if a number is positive negative

          //--:
        int a = 20;     //a=a-1;//19
        --a;
        System.out.println(a);

          //++:
        int b = 10;     //b=b+1; //b=11
        ++b;
        System.out.println(b);
//pre:
        int x = 100;
        System.out.println(++x); //101

        int y = 200;
        System.out.println("y is " +--y); //199

        int z = 80;
        System.out.println(--z); //79
        System.out.println("Z is "+ (++z)); //80

        int j = 100;
        j /= 2; // 50
        System.out.println(j);

        j *=2; //100
        System.out.println(j);

        System.out.println("=================");

        // %=
        int num = 100;
        num %= 3;
        System.out.println(num);

        double num2 = 400.5;
        num2 %= 2;
        System.out.println(num2);




    }
}
