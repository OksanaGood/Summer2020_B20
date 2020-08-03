package Day10_if_Statement;

public class GradeCalculator {
    //grade:
    //    90 ~ 100 ==> A
    //    80 ~ 89 ==> B
    //    70 ~ 79 ==> C
    //    60 ~ 69 ==> D
    //    otherwise ==> F

    public static void main(String[] args) {

        int score =95;
        String grade = "";

        if (score>=90 && score<=100) { // 90 <= score <= 100
            grade = "A";
        }else if (score >=80 && score<= 89) {
            grade = "B";
        }else if (score >=70 && score<=79) {
            grade = "C";
        }else if (score >=60 && score<=69) {
            grade = "you made D";
        }else if(score>=0 && score<=59){
            grade = "you made F";
        }else{  //score < 0 or score > 100
            grade = "Invalid Score";
        }
        System.out.println(grade);
    }

}
