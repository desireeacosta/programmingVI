package proxy;

public class Main {
  public static void main(String[] args) {

    UserAuthenticator commAuth = new UserAuthenticator(new CommonAuth());
    UserAuthenticator googleAuth = new UserAuthenticator(new GoogleAuth());

    System.out.println("Login with google");
    googleAuth.loginToApp("account123@gmail.com", "yes");
    googleAuth.loginToApp("account123@yahoo.com", "no?");

    System.out.println();

    System.out.println("Application login");
    commAuth.loginToApp("account456@hotmail.com", "no!");
  }
}
