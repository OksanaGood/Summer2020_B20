package Day05ArithmeticOperators;

public class practice {
    public static void main(String[] args) {
        int a =5+2*4;
        System.out.println(a);

        int b =10/2-3;
        System.out.println(b);

        int c =8+12*2-4;
        System.out.println(c);

        int d =4+17%2-1; //17/2=8
                         //remainder: 17-(2*8)=16
        // 4+1-1=4
        System.out.println(d);

        System.out.println(5+5/5); //6
        System.out.println((5+5)/5.0); //2.0
        System.out.println((5+5)/5);   //2

        int y= 5*2/3+(4*3);
           //5*2/3+12
           //10/3+12; int/int=int
           //3+12=15
        System.out.println(y);

        double z = 5*2/3.0+(4*3);
        //5*2/3+12
        //10/3.0+12; int/int=int
        //3.33+12=15
        System.out.println(z);


    }

}
