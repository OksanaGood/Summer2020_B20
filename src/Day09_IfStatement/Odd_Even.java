package Day09_IfStatement;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Odd_Even {
    public static void main(String[] args) {

        int number = 101;

        if (number % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }


     int a = 300;
     int b = 700;

     if(a>b) {
         System.out.println(a+ " is greater");
     }else  {               //if (b>a) {
         System.out.println(b+ " is greater");
     }
    }

}

