/**
 * 
 */
public class Cat extends Animal {

  @Override
  public void eat() {
    System.out.println("I eat mouse");
  }

  @Override
  public void makeSound() {
    System.out.println("I meows");
  }

  @Override
  public void run() {
    System.out.println("I run at 30km/h");
  }

}
