public class Dog extends TerrestrialAnimal {

  @Override
  public void eat() {
    System.out.println("I eat some bones");
  }

  @Override
  public void makeSound() {
    System.out.println("I bark");
  }

  @Override
  public void runSpeed() {
    System.out.println("I run 25km/h");
  }

}
