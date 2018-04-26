package foo.bar;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rudolph on 26.04.18.
 */
public class HelloFactoryBean {

  public String getMessage() {
    return "Hello from factory bean";
  }

  public String getMessage2() {
    return "Another Hello from factory bean!";
  }

}
