package Day_39_CustomeClass;

public class Car {

    /* Attributes:
    * model, brand, year, color, mileage, vin...*/
    // attributes of class
    String brand; // only one instance variable can contain many
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setInfo(String carBrand, String carModel, int carYear,
                        String carColor, double carMileage, double carPrice ){

        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;


}

}
