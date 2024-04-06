public class Main {
    public static void main(String[] args) {
        // Create an instance of DataStorage for Vehicle
        DataStorage<Vehicle> vehicleDataStorage = new DataStorage<>();

        // Add vehicle objects to list
        vehicleDataStorage.addToList(new Vehicle("Toyota", "Car"));
        vehicleDataStorage.addToList(new Vehicle("Honda", "Motorcycle"));
        vehicleDataStorage.addToList(new Vehicle("Isuzu", "Truck"));

        // Add vehicle objects to map
        vehicleDataStorage.addToMap("Sedan", new Vehicle("Mazda", "Car"));
        vehicleDataStorage.addToMap("Sport", new Vehicle("Yamaha", "Motorcycle"));

        // Print list of vehicle objects
        System.out.println("List of Vehicles:");
        DataStorage.printList(vehicleDataStorage.getListData());

        // Print map of vehicle objects
        System.out.println("\nMap of Vehicles:");
        DataStorage.printMap(vehicleDataStorage.getMapData());
    }
}
