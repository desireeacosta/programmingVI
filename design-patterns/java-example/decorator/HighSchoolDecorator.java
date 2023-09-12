package decorator;

class HighSchoolDecorator extends PersonDecorator {
  public HighSchoolDecorator(PersonComponent component) {
    super(component);
  }

  @Override
  public String getInfo() {
    return super.getInfo() + ", Graduation year: 2020";
  }
}
