package foo.baz;

import foo.bar.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by rudolph on 26.04.18.
 */
@Component
public class HelloServiceImpl555 implements HelloService {

  @Autowired
  @Qualifier("another")
  private String msg;

  @Override
  public String sayHello() {
    return msg;
  }

}
