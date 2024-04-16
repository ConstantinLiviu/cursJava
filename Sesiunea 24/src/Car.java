public class Car {
    public String model;
    public String brand;

    public void functioneaza() {
        System.out.println("Masina e functionala");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
}
