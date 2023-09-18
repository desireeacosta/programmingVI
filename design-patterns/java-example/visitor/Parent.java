package visitor;

public class Parent implements Person {
  private String name;
  private Person child;

  public Parent(String name, Person child) {
    this.name = name;
    this.child = child;
  }

  @Override
  public void sayHi() {
    System.out.println("Hi! I have a Child!");
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitParent(this);
  }

  @Override
  public String getName() {
    return this.name;
  }

  public Person getChild() {
    return child;
  }
}
