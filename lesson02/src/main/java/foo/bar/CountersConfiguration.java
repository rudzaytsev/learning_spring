package foo.bar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by rudolph on 01.05.18.
 */
@Configuration
public class CountersConfiguration {

  @Bean
  @Scope
  public Counter singletonCounter() {
    return new Counter();
  }

  @Bean
  @Scope("prototype")
  public Counter prototypeCounter() {
    return new Counter();
  }
}
