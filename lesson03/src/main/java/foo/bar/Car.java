package foo.bar;

/**
 * Created by rudolph on 03.05.18.
 */
public class Car {

  private String name;
  private String color;
  private int price;

  public Car(String color, String name, int price) {
    this.color = color;
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Car{" + color + ":" + name + ":" + price + "}";
  }
}
