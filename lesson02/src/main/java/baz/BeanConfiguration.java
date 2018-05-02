package baz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rudolph on 03.05.18.
 */
@Configuration
@ComponentScan
public class BeanConfiguration {

  @Bean
  public MyBean myBean() {
    return new MyBean();
  }
}
