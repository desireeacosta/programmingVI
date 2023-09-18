package responsibilitychain;

public class Main {
  public static void main(String[] args) {
    Server server = new Server();
    server.loggedUsers.add("realemail@gmail.com");
    server.loggedUsers.add("email222@yahoo.com");

    PurchaseRequest notAuthed = PurchaseRequest.builder().userEmail("me@gmail.com").product("Chair").build();
    PurchaseRequest noPaymentInfo = PurchaseRequest.builder().userEmail("realemail@gmail.com").build();
    PurchaseRequest notEnoughMoney = PurchaseRequest.builder().userEmail("email222@yahoo.com").product("Book A").quantity(10).unitPrice(50).creditCardMoney(5).build();
    PurchaseRequest successfullRequest = PurchaseRequest.builder().userEmail("email222@yahoo.com").creditCardMoney(100000).build();

    Handler handler = Handler.link(
      new AuthHandler(server),
      new PayInfoHandler(),
      new MoneyHandler()
    );

    server.setHandler(handler);

    System.out.println("---------------------------------------------");
    server.purchase(notAuthed);
    System.out.println("---------------------------------------------");
    server.purchase(noPaymentInfo);
    System.out.println("---------------------------------------------");
    server.purchase(notEnoughMoney);
    System.out.println("---------------------------------------------");
    server.purchase(successfullRequest);
  }
}
