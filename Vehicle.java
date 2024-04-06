public class Vehicle {
    private String brand;
    private String type;

    public Vehicle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle [Brand=" + brand + ", Type=" + type + "]";
    }
}
