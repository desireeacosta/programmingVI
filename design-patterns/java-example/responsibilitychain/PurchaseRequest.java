package responsibilitychain;

public class PurchaseRequest {
  private String userEmail;
  private CreditCard creditCard;
  private String product;
  private int quantity;
  private double unitPrice;

  private PurchaseRequest(Builder builder) {
    this.userEmail = builder.userEmail;
    this.creditCard = builder.creditCard;
    this.product = builder.product;
    this.quantity = builder.quantity;
    this.unitPrice = builder.unitPrice;
  }

  public String getProduct() {
    return product;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public CreditCard getCreditCard() {
    return creditCard;
  }

  public static Builder builder() {
    return new Builder();
  }

  static class Builder {
    private String userEmail;
    private CreditCard creditCard;
    private String product;
    private int quantity;
    private double unitPrice;

    public Builder userEmail(String userEmail) {
      this.userEmail = userEmail;
      return this;
    }

    public Builder creditCardMoney(int money) {
      this.creditCard = new CreditCard();
      creditCard.money = money;
      return this;
    }

    public Builder product(String product) {
      this.product = product;
      return this;
    }

    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    public Builder unitPrice(double unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }

    public PurchaseRequest build() {
      return new PurchaseRequest(this);
    }
  }
}
