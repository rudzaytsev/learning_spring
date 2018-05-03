package foo.bar;

import foo.baz.HelloConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

  public static void main(String[] args) {

    argumentsCheck(args);
    if (args[0].equals("xml")) {
      initXmlAppContext();
    }
    else if (args[0].equals("@")) {
      initAnnotationsXmlAppContext();
    }
    else if (args[0].equals("java")) {
      initInitApplicationContextFromJavaConfig();
    }
  }

  private static void initInitApplicationContextFromJavaConfig() {
    ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
    HelloService helloService = (HelloService) context.getBean(HelloService.class);
    System.out.println("-----------------------------------------------------------");
    System.out.println(helloService.sayHello());
    System.out.println("-----------------------------------------------------------");

  }

  private static void initAnnotationsXmlAppContext() {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:annotation-config.xml");
    HelloService helloService = (HelloService) context.getBean(HelloService.class);
    System.out.println("-----------------------------------------------------------");
    System.out.println(helloService.sayHello());
    System.out.println("-----------------------------------------------------------");

    HelloServiceWrapper222 wrapper = (HelloServiceWrapper222) context.getBean(HelloServiceWrapper222.class);
    System.out.println("-----------------------------------------------------------");
    System.out.println(wrapper.sayHi());
    System.out.println("-----------------------------------------------------------");
  }

  private static void initXmlAppContext() {
    ApplicationContext context = new ClassPathXmlApplicationContext("xml-config.xml");
    HelloService helloService = (HelloService) context.getBean("beanId");

    System.out.println("-----------------------------------------------------------");
    System.out.println(helloService.sayHello());
    System.out.println("-----------------------------------------------------------");

    HelloService helloService2 = (HelloService) context.getBean("anotherBeanId");
    System.out.println(helloService2.sayHello());
    System.out.println("-----------------------------------------------------------");

    HelloService wrapper = (HelloService) context.getBean("wrapperBeanId");
    System.out.println(wrapper.sayHello());
    System.out.println("-----------------------------------------------------------");

    HelloService wrapper2 = (HelloService) context.getBean("wrapper2BeanId");
    System.out.println(wrapper2.sayHello());
    System.out.println("-----------------------------------------------------------");

    HelloService helloService3 = (HelloService) context.getBean("propBeanId");
    System.out.println(helloService3.sayHello());
    System.out.println("-----------------------------------------------------------");


  }

  private static void argumentsCheck(String[] args) {
    if (args.length <= 0) {
      System.out.println(
        "This program should accept an argument: \n" +
        "xml - for XML configuration, " +
        "@ - for annotations + XML configuration, " +
        "java - for java configuration"
      );
      System.exit(1);
    }
  }
}
