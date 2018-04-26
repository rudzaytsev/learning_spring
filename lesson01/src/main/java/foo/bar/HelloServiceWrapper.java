package foo.bar;

/**
 * Created by rudolph on 25.04.18.
 */
public class HelloServiceWrapper implements HelloService {

  private HelloService service;

  public HelloServiceWrapper(HelloService service) {
    this.service = service;
  }

  @Override
  public String sayHello() {
    return "<<<[ " + service.sayHello() + " ]>>>";
  }
}
