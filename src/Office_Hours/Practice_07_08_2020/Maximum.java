package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;
import java.util.Scanner;
public class Maximum {

    // 1. write a program that asks user to enter 5 numbers and returns the maximum number

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int max  = -9999999;  // -100

            for(int i = 10; i <= 50; i += 10) {

                System.out.println("Enter a number");
                int num = scan.nextInt(); //

                if(num > max ){
                    max = num;
                }

            }

            System.out.println("Max number: " +max);



        }


    }
