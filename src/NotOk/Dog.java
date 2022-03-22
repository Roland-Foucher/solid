public class Dog extends Animal {

  @Override
  public void eat() {
    System.out.println("I eat some bones");
  }

  @Override
  public void makeSound() {
    System.out.println("I bark");
  }

  @Override
  public void run() {
    System.out.println("I run 25km/h");
  }

}
