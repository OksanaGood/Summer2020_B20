package Day_12_Switch_Scanner;
import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        System.out.println("How many hours do you work in a week");
        int weeklyHour = input.nextInt();

        int totalHour = weeklyHour * 52;
        double hourlyRate = salary / totalHour;
        System.out.println("Your hourly rate is :$"+ hourlyRate);


    }

}
