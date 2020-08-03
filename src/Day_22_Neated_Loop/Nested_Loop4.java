package Day_22_Neated_Loop;
/*
 *
 **
 ***
 ****
 *****
 ******
 *******
 *******
 ******
 *****
 ****
 ***
 **
 *
 */
public class Nested_Loop4 {
    public static void main(String[] args) {

        for (int j = 1; j <=7; j++) {   //7 lines

            for (int k = 1; k <= j; k++) { // # in line
                System.out.print("*");
            }
            System.out.println();
        }
            System.out.println("================================");

            for (int j = 7; j >=1; j-- ){  // 7 lines
                for (int k= j; k >=1; k--){ // # in line
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }

