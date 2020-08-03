package Day08_LogicalOperators;

public class Convert_Gallon_Litre {
      /*  1. write a java program that converts gallons to liters

                        1 gallon = 3.785 liters

                        1 litter = 1/3.785*/

    public static void main(String[] args) {

        double gallons = 15;
        double litres = gallons * 3.785;
        System.out.println(gallons + " gallons equal to " +litres + " litres");
    }

}
