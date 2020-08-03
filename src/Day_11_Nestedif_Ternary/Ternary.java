package Day_11_Nestedif_Ternary;

public class Ternary {

    public static void main(String[] args) {
        int num =100;
        String result = "";
        if (num%2==0){
            result = "Even";
        }else {
            result ="Ode";
        }
        System.out.println(result);

        System.out.println("111======================================");

        String result2 = (num%2==0) ? "Even":"Odd";
        System.out.println(result2);

        System.out.println("222====================================  ");
        int num1 = 10;
        int num2 = 20;
        int max1 = 0;

        if (num1>num2){
            max1 = num1;
        }else {
            max1 = num2;
        }
        System.out.println(max1);

        int max2 = (num1>num2) ? num1 : num2;
        System.out.println(max2);

        System.out.println("333========================================");

        int age = 20;
        boolean eligible = false;

        if (age >21){
            eligible = true;
        }else{
            eligible = false;
        }
        System.out.println(eligible); // false

        boolean eligible1=(age >21) ? true : false;
        System.out.println(eligible1); //false

        System.out.println("444======================================");

        int age1 = 25;
        boolean canvote = false;

        if (age1 >21){
            canvote = true;
        }else{
            canvote = false;
        }
        System.out.println(canvote);

        boolean canvote1 = (age1 >21) ? true:false;
        System.out.println(canvote1);
        System.out.println("555======================================");



    }
}
