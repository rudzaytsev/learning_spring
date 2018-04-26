package foo.bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by rudolph on 26.04.18.
 */
@Component
public class HelloServiceImpl222 implements HelloService {

  private String msg;

  @Autowired
  public HelloServiceImpl222(@Qualifier("helloMsg") String msg) {
    this.msg = msg;
  }

  @Override
  public String sayHello() {
    return msg;
  }


}
