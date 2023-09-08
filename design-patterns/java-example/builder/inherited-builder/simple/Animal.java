package simple;

public class Animal {
  private int age;
  private String species;

  protected Animal(Builder<?> builder) {
      this.age = builder.age;
      this.species = builder.species;
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
      private int age;
      private String species;

      public abstract T getThis();

      public T age(int age) {
          this.age = age;
          return this.getThis();
      }

      public T species(String species) {
        this.species = species;
        return this.getThis();
    }

      public Animal build() {
          return new Animal(this);
      }
  }

}