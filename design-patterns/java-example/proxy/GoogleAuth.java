package proxy;

// Proxy class
public class GoogleAuth implements AuthInterface{
  private CommonAuth service;

  public GoogleAuth() {
    this.service = new CommonAuth();
  }

  @Override
  public void login(String email, String password) {
    if (verifyExternalExistence(email)) {
      service.login(email, password);
    } else {
      System.out.println("This account does not exist. Try again.");
    }
  }

  boolean verifyExternalExistence(String email) {
    return email.endsWith("@gmail.com");
  }

}
