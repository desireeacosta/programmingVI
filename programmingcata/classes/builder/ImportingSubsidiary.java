package classes.builder;

public class ImportingSubsidiary extends Subsidiary {
  private String shipmentDepartment;

  public ImportingSubsidiary(Builder builder) {
    super(builder);
    this.shipmentDepartment = builder.shipmentDepartment;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder extends Subsidiary.Builder<Builder> {
    private String shipmentDepartment;

    @Override
    public Builder getThis() {
      return this;
    }

    public Builder shipmentDepartment(String shipmentDepartment) {
      this.shipmentDepartment = shipmentDepartment;
      return this;
    }

    public ImportingSubsidiary build() {
      return new ImportingSubsidiary(this);
    }

  }
}
