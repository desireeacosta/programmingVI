package visitor;

public class ConcreteVisitor implements Visitor {

  public String printFamilyChain(Person... args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Chain of parents and its childs: \n");
    for (Person person : args) {
      sb.append(person.accept(this)).append("\n");
    }
    return sb.toString();
  }

  @Override
  public String visitParent(Parent parent) {
    return "Hi, I'm " + parent.getName() + " and my child is: \n" + parent.getChild().accept(this);
  }

  @Override
  public String visitChild(Child child) {
    return "Hi! I'm " + child.getName() + "\n";
  }

}
