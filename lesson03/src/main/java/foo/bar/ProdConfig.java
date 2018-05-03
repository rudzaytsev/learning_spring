package foo.bar;

/**
 * Created by rudolph on 03.05.18.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class ProdConfig {

  @Bean
  public CarService carService() {
    return new ProdCarService();
  }
}
