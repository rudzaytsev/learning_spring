package foo.bar;

/**
 * Created by rudolph on 25.04.18.
 */
public class HelloServiceWrapper2 implements HelloService {

  private HelloService service1;
  private HelloService service2;

  public HelloServiceWrapper2(HelloService first, HelloService second) {
    this.service1 = first;
    this.service2 = second;
  }

  @Override
  public String sayHello() {
    return "First: " + service1.sayHello() +
           "\nSecond: " + service2.sayHello();

  }

  public void setService1(HelloService service1) {
    this.service1 = service1;
  }

  public void setService2(HelloService service2) {
    this.service2 = service2;
  }
}
