/**
 * Bird extends animal class Exemple with Bird : the bird can't run, we don't respect Liskov's
 * Substitution Principle
 * 
 * To respect Liskov's Substitution Principle we have to make Animal class without run and for
 * exemple a TerrestrialAnimal class with run() and FlyAnimal with fly()
 */
public class Bird extends Animal {

  @Override
  public void eat() {
    System.out.println("I eat some worms");

  }

  @Override
  public void makeSound() {
    System.out.println("I sing");

  }

  @Override
  public void run() {
    System.out.println("I can't run !!");
  }

}


