package classes.adapter;

public class Truck {
  private int id;
  private double price;
  private double supportedWeight;

  public Truck(int id, double price, double supportedWeight) {
    this.id = id;
    this.price = price;
    this.supportedWeight = supportedWeight;
  }

  public double getSupportedWeight() {
    return supportedWeight;
  }
}
