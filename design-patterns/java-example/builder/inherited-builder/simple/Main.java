package simple;

public class Main {
  public static void main(String[] args) {
    Animal animal = Animal.builder().age(12).build();

    Pet myFirstPet = Pet.builder().age(2).name("Dante").build();
    Pet mySecondPet = Pet.builder().age(12).species("equine").name("Bo").build();
  }
}
