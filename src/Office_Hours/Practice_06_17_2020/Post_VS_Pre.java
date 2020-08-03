package Office_Hours.Practice_06_17_2020;

public class Post_VS_Pre {

    public static void main(String[] args) {
        int a =300;
        System.out.println(++a); //a=301
        System.out.println(++a); //a=302

        int b = 50;
        System.out.println(--a); // 49
        System.out.println(--a); // 48

        int x = 40;
        System.out.println(x--); //40
        System.out.println(x);   //39
        System.out.println(x--); //39
        System.out.println(x);   //38


        int y = 60;
        System.out.println(y++);  //60
        System.out.println(y);    //61
        System.out.println(y++);  //61
        System.out.println(y);    //62
    }
}
