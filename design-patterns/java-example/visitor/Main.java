package visitor;

public class Main {
  public static void main(String[] args) {
    Child johnChild = new Child("Tim");
    Parent firstChild = new Parent("John", johnChild);
    Parent grandpa = new Parent("Richard", firstChild);

    ConcreteVisitor concreteVisitor = new ConcreteVisitor();
    System.out.println(concreteVisitor.printFamilyChain(grandpa, firstChild, johnChild));;
  }
}
