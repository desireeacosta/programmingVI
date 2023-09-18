package responsibilitychain;

import java.util.ArrayList;
import java.util.List;

public class AuthHandler extends Handler {
  private Server server;

  public AuthHandler(Server server) {
    this.server = server;
  }

  @Override
  public boolean check(PurchaseRequest request) {
    if (!server.getLoggedUsers().contains(request.getUserEmail())) {
      System.out.println("Please, login to purchase");
      return false;
    }
    return checkNext(request);
  }
}
