package Day07_Unary_ShortHand;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ShortHand {

    public static void main(String[] args) {
        int a =100;
        //a = a * a;
        a*=a;
        System.out.println(a);  // 10000

        int b =2;
        b*=3;
        System.out.println(b);

        int c = 300;
        c-=100;
        System.out.println(c);
        System.out.println("===============================");

        int z =300;
        z+=200;        //z += 200; //z=z+200
        System.out.println(z);

        System.out.println("===============================");

        String schoolName = "Cybertek";
        schoolName += " School";
        System.out.println(schoolName);


        String fullName = "Donald";
               fullName += " Tramp";
        System.out.println(fullName);

        String fullName1 = "Mickey";
        fullName1 += " Mouse";
        System.out.println(fullName1);

        String fullName2 = "Donald Tramp";
       // fullName2 -= " Tramp"; //doesnt work
        System.out.println(fullName);

        int budget = 100000; //=50000
        budget /= 2;
        System.out.println(budget);

        int q = 100;
        System.out.println(q/2); //=50
        System.out.println(q);   //100







    }
}
