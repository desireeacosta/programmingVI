package responsibilitychain;

public class MoneyHandler extends Handler{

  @Override
  public boolean check(PurchaseRequest request) {
    CreditCard card = request.getCreditCard();
    double money = card.money;
    double totalPrice = request.getUnitPrice() * request.getQuantity();

    if (totalPrice > money) {
      System.out.println("You don't have enough money to purchase this request");
      return false;
    }
    return checkNext(request);
  }
  
}