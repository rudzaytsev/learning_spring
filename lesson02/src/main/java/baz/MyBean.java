package baz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by rudolph on 03.05.18.
 */
public class MyBean {

  private String message;

  @Lucky
  private String message2;

  @PostConstruct
  public void foo() {
    System.out.println("Bean is initialized!");
  }

  @PreDestroy
  public void bar() {
    System.out.println("Destroy method called");
  }

  public String getMessage() {
    return message;
  }

  public String getMessage2() {
    return message2;
  }
}
