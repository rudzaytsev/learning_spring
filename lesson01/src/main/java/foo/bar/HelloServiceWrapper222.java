package foo.bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by rudolph on 26.04.18.
 */
@Component(value = "wrapper222")
public class HelloServiceWrapper222 {

  private HelloService service;

  @Autowired
  public void setService(HelloService service) {
    this.service = service;
  }


  public String sayHi() {
    return "{{{ " + service.sayHello() + " }}}";
  }
}
