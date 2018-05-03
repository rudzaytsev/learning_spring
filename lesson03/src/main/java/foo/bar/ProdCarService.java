package foo.bar;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rudolph on 03.05.18.
 */
public class ProdCarService implements CarService {

  @Override
  public List<Car> getAllCars() {
    return Arrays.asList(
      new Car("green", "Toyota Camry", 2000000),
      new Car("blue", "BMW X6", 3000000)
    );
  }
}
