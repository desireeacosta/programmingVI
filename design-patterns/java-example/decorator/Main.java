package decorator;

public class Main {
  public static void main(String[] args) {
    PersonDecorator person = 
      new HighSchoolDecorator(
        new ProfessionDecorator(
          new PersonConcrete("Paz", 30)));

    System.out.println(person.getInfo());

    PersonDecorator person2 = 
        new ProfessionDecorator(
          new PersonConcrete("Javier", 29));

    System.out.println(person2.getInfo());
  }
}
