package Day_13_Scanner;
import java.util.Scanner;
public class Scanner_next {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Fnter your company name:");
        String companyName = scan.next();
        System.out.println("Your company name:"+ companyName);

    }
}
