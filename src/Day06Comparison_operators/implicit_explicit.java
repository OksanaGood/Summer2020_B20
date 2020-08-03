package Day06Comparison_operators;

public class implicit_explicit {

    public static void main(String[] args) {

        double d1 = 400.55555;
        int i1 = (int)d1; //400
        System.out.println(i1);

        long L1 = 4400;
        short sh1 = (short)L1;
        System.out.println(sh1);

        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1); //-24

        double m1 = 34.5;
        float f1 = (long)m1;  //int, =34.0
        System.out.println(f1);

        long r1 = -500;
        int p1 = (int)r1; //short
        System.out.println(p1);

        long r2 = 13;
        byte t1 = (byte)r2;
        System.out.println(t1);



    }
}
