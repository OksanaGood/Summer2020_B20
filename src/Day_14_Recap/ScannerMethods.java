package Day_14_Recap;

import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //double num = input.nextDouble();
        //int num = input.nextInt(); //enter any number, that assigned to the int num
        //String num = input.next(); // only one word;  yes/no answers;
        //System.out.println("You have entered "+ num);
        System.out.println("Do you want to learn Java?");
        String num = input.nextLine();

        System.out.println("You have entered"+num);
    }
}
