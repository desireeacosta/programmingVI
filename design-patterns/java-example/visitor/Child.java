package visitor;

public class Child implements Person{
  private String name;

  public Child(String name) {
    this.name = name;
  }

  @Override
  public void sayHi() {
    System.out.println("Hi! I am a child.");
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitChild(this);
  }

  @Override
  public String getName() {
    return this.name;
  }
  
}
