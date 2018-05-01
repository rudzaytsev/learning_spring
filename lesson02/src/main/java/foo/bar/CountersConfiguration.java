package foo.bar;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.*;

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
  @Scope(SCOPE_PROTOTYPE)
  public Counter prototypeCounter() {
    return new Counter();
  }
}
