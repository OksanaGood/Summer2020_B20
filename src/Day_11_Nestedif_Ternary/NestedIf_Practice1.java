package Day_11_Nestedif_Ternary;

public class NestedIf_Practice1 {
    public static void main(String[] args) {

        double salary = 29999;
        double jobHistory = 20;

        if (salary >= 30000){
            if (jobHistory >=2){
                System.out.println("You are qualified");
            }else { // JobHistory < 2
                System.out.println("You must have been on job at least 2 years");
            }
        }else{
            System.out.println("you must earn at least $30K");
        }
    }
}
