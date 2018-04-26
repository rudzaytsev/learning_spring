package foo.bar.baz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by rudolph on 26.04.18.
 */

@Configuration
@ComponentScan
@PropertySource("classpath:new-msg.properties")
public class HelloConfig {

  @Value("${text}")
  private String messageText;

  @Value("${text2}")
  private String anotherMessageText;

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Bean
  public String message() {
    return messageText;
  }

  @Bean
  public String another() {
    return anotherMessageText;
  }

}
