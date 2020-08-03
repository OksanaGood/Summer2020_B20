package Day08_LogicalOperators;

public class Convert_Litres_Gallons {

    /*    2. write a java program that converts litters to gallons

                        1 gallon = 3.785 liters

                        1 litter = 1/3.785*/

    public static void main(String[] args) {

        double litres = 20;
        double gallons = litres / 3.785;

        System.out.println(litres +" littres are equal to "+(int)gallons+ " gallons");

    }
}
