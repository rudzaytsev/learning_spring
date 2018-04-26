package foo.bar;

public class HelloServiceImpl implements HelloService {

  private String msg;

  public HelloServiceImpl() {
  }

  public HelloServiceImpl(String msg) {
    this.msg = msg;
  }

  @Override
  public String sayHello() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
