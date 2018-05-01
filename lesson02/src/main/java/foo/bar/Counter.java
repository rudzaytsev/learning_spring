package foo.bar;

/**
 * Created by rudolph on 01.05.18.
 */
public class Counter {

  private int count = 0;

  public void increment() {
    count++;
  }

  @Override
  public String toString() {
    return String.valueOf(count);
  }
}
