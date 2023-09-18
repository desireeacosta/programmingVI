package proxy;

public class CommonAuth implements AuthInterface{

  @Override
  public void login(String email, String password) {
    System.out.println("Logged successfully!");
  }
}
