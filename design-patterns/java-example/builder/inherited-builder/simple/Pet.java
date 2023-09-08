package simple;

public class Pet extends Animal {
  private String name;

  public Pet(Builder builder) {
      super(builder);
      this.name = builder.name;
  }

  public static Builder builder() {
      return new Builder();
  }

  public static class Builder extends Animal.Builder<Builder> {

      private String name;

      @Override
      public Builder getThis() {
          return this;
      }

      public Builder name(String name) {
          this.name = name;
          return this;
      }

      public Pet build() {
          return new Pet(this);
      }

  }

}