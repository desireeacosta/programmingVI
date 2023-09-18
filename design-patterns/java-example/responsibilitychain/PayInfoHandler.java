package responsibilitychain;

public class PayInfoHandler extends Handler {

  @Override
  public boolean check(PurchaseRequest request) {
    CreditCard card = request.getCreditCard();
    if (card == null) {
      System.out.println("Please, insert your card information before making a purchase.");
      return false;
    }
    return checkNext(request);
  }
}
