package responsibilitychain;

import java.util.ArrayList;
import java.util.List;

public class Server {
  private Handler handler;
  List<String> loggedUsers = new ArrayList<>();

  public void setHandler(Handler handler) {
    this.handler = handler;
  }

  public boolean purchase(PurchaseRequest request) {
    if (handler.check(request)) {
      System.out.println("Purchased successfully!");
      return true;
    }
    return false;
  }

  public void addEmail(String userEmail) {
    loggedUsers.add(userEmail);
  }

  public List<String> getLoggedUsers() {
    return loggedUsers;
  }
}
