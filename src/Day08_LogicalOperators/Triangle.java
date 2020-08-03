package Day08_LogicalOperators;

public class Triangle {
// A triangle is valid
    public static void main(String[] args) {
        double angle1 = 100;  //double because could be decimal
        double angle2 = 60;
        double angle3 = 20;

        boolean valid = angle1 + angle2 + angle3 == 180;
        boolean invalid = !valid;

        if(valid){
            System.out.println("Valid Triangle");
        }
        if(invalid){
            System.out.println("Invalid Triangle");
        }

    }
}
