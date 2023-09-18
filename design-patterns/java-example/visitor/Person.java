package visitor;

public interface Person {
  void sayHi();
  String getName();
  String accept(Visitor visitor);
}
