package foo.bar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by rudolph on 03.05.18.
 */

@Profile("demo")
@Configuration
public class DemoConfig {

  @Bean
  public CarService carService() {
    return new DemoCarService();
  }
}
