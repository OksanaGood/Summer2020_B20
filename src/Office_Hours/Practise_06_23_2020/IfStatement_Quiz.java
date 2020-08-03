package Office_Hours.Practise_06_23_2020;

public class IfStatement_Quiz {

    public static void main(String[] args) {

        int score =0;
        if (score == 0){   //0==0=>true
            score += 50;   // score = score +50; 0+50=50;
        }
        if (score != 0){
            // 50 != 0 => true => gets executed
            score += 50; //score = 100
        }                         // two independet if statement
        System.out.println(score);
        System.out.println("====================================");
        char grade = 'A';
        boolean passed = grade =='A' || grade == 'B';
                        // 'A' == 'A'||
                        //     true
        boolean passed2 = grade =='C'|| grade =='D';
                        //  'A' =='C'||'A' =='D'
                        //    false  ||  false => false;
        if (passed || passed2){        //one if statement
            //true || false => true
            System.out.println("You passed the exame");
        }else{
            System.out.println("You failed");

            System.out.println("================================");
            int number = 10;


        }

    }

}
