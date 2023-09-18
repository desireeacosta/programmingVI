package visitor;

public interface Visitor {
  String visitParent(Parent parent);
  String visitChild(Child child);
}
