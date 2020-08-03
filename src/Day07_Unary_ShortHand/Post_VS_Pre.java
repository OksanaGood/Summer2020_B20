package Day07_Unary_ShortHand;

public class Post_VS_Pre {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a);//11
        System.out.println(a);  //11

        int b = 10;
        System.out.println(b++); //10
        System.out.println(b);   //11

        int c = 25;
        int d = c++; //d=25;
        // c=26
        System.out.println(c); //26
        System.out.println(d); //25

        int e =25;
        e++;
        System.out.println(e); //26

        int x = 8;
        int y = x--;  //y=8
        System.out.println(y); //8
        System.out.println(x); //7

        int A = 1; //A=0
        A = -A-- +A++ / -A-- * --A;
        //  -1 +  0   / -1   *  -1
        //A =-1+     0       *  -1
        //A =-1 + 0 = -1
        System.out.println(A);

        int B =50; //B=49, 50
       B = --B + B++ + B-- + B++;
       // B= 49 + 49 + 50 + 49
        System.out.println(B);

        int X = 4;
        int Y = X*4-X++;
        //Y= 4 * 4 - 4
        System.out.println(Y);








    }
}
