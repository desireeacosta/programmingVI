package responsibilitychain;

public abstract class Handler {
  private Handler next;

  public static Handler link(Handler first, Handler... chain) {
    Handler head = first;
    for (Handler nextHandler : chain) {
      head.next = nextHandler;
      head = nextHandler;
    }
    return first;
  }

  public abstract boolean check(PurchaseRequest request);

  protected boolean checkNext(PurchaseRequest request) {
    if (next == null) {
      return true;
    }
    return next.check(request);
  }
}
