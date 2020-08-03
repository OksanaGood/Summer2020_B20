package Day_12_Switch_Scanner;

public class Switch_Practice2 {

    public static void main(String[] args) {
        String productName = "iPhone";

        switch (productName){
            case "Galaxy":
                System.out.println("Samsung");
                break;
            case "iPhone":
            case "ipad":
            case "MackBook":
                System.out.println("Apple");
                break;
        }

    }
}
