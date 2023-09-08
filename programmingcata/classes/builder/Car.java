package classes.builder;

public class Car {
  private int id;
  private EnergyType energyType;
  private int model;
  private double price;
  private Precedence precedence;

  private Car(Builder builder) {
    this.id = builder.id;
    this.energyType = builder.energyType;
    this.model = builder.model;
    this.price = builder.price;
    this.precedence = builder.precedence;
  }

  public static Builder builder() {
    return new Builder();
  }

  private static class Builder {
    private int id;
    private EnergyType energyType;
    private int model;
    private double price;
    private Precedence precedence;

    public Builder id(int id) {
      this.id = id;
      return this;
    }

    public Builder energyType(EnergyType energyType) {
      this.energyType = energyType;
      return this;
    }

    public Builder model(int model) {
      this.model = model;
      return this;
    }

    public Builder model(double price) {
      this.price = price;
      return this;
    }

    public Builder precedence(Precedence precedence) {
      this.precedence = precedence;
      return this;
    }

    public Car build() {
      return new Car(this);
    }
  }
}
