package proxy;

public class UserAuthenticator {
  AuthInterface authenticator;

  public UserAuthenticator(AuthInterface authenticator) {
    this.authenticator = authenticator;
  }

  public void loginToApp(String email, String password) {
    authenticator.login(email, password);
  }
}
