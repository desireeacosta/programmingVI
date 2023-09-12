package classes.adapter;

public class Main {
  public static void main(String[] args) {
    Car firstModelCar = new Car();
    Truck cargoTruck = new Truck(1, 100, 100);
    
    Stock carStock = new Stock(firstModelCar);

    //This won't compile, so we use an adapter
    //Stock cargoTruckStock = new Stock(cargoTruck);

    TruckAdapter truckAdapter = new TruckAdapter(cargoTruck);
    Stock cargoTruckStock = new Stock(truckAdapter);
  }
}
