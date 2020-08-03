package Day09_IfStatement;

public class MidiumNumber {

    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean aIsMid = (a>b && a<c) || (a>c && a<b);
        boolean bIsMid = (b>c && b<a) || (b<c && b>a);

        boolean cIsMid = !aIsMid || !bIsMid;

        double mid = 0;

        if (aIsMid){
            mid = a;
        }
        if (bIsMid){
            mid = b;
        }
        if (cIsMid){
            mid = c;
        }
        System.out.println(mid + " is the midium number");
    }
}
