package decorator;

public class ProfessionDecorator extends PersonDecorator{
  public ProfessionDecorator(PersonComponent component) {
    super(component);
  }

  @Override
  public String getInfo() {
    return super.getInfo() + ", Profession: Lawyer";
  }
}
