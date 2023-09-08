package classes.builder;

import java.util.Map;

public class Subsidiary {
  private Map<Integer, Car> cars;
  private String country;

  protected Subsidiary(Builder<?> builder) {
    this.cars = builder.cars;
    this.country = builder.country;
  }

  public static Builder builder() {
    return new Builder() {
      @Override
      public Builder getThis() {
        return this;
      }
    };
  }

  public abstract static class Builder<T extends Builder<T>> {
    private Map<Integer, Car> cars;
    private String country;

    public abstract T getThis();

    public T cars(Map<Integer, Car> cars) {
      this.cars = cars;
      return this.getThis();
    }

    public T country(String country) {
      this.country = country;
      return this.getThis();
    }

    public Subsidiary build() {
      return new Subsidiary(this);
    }
  }
}
