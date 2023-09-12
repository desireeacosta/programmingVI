package decorator;

public class PersonConcrete implements PersonComponent{
  private String name;
  private int age;

  public PersonConcrete(String name, int age) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String getInfo() {
    return "Name: " + name + ", Age: " + age;
  }
}
