package decorator;

public class PersonDecorator implements PersonComponent {
  private PersonComponent wrappee;

  public PersonDecorator(PersonComponent component) {
    this.wrappee = component;
  }

  @Override
  public String getInfo() {
    return wrappee.getInfo();
  }
}
