/**
 * 
 */
public class Cat extends TerrestrialAnimal {

  @Override
  public void eat() {
    System.out.println("I eat mouse");
  }

  @Override
  public void makeSound() {
    System.out.println("I meows");
  }

  @Override
  public void runSpeed() {
    System.out.println("I run at 30km/h");
  }

}
