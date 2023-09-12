package classes.adapter;

public class Stock {
  private Car car;
  private int quantity;

  public Stock(Car firstModelCar) {
    this.car = firstModelCar;
  }

  public Car getCar() {
    return car;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}
