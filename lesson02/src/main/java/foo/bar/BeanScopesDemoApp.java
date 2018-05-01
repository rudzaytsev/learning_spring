package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopesDemoApp {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(CountersConfiguration.class);
    runSingletonBeanExample(context);
    runPrototypeBeanExample(context);
  }


  private static void runSingletonBeanExample(ApplicationContext context) {
    Counter singletonCounter = (Counter) context.getBean("singletonCounter");

    System.out.println("-------------- Singleton Bean Scope Example ----------------");
    System.out.println("After first retrieve SingletonCounter = " + singletonCounter);
    singletonCounter.increment();
    System.out.println("SingletonCounter = " + singletonCounter);
    singletonCounter.increment();
    System.out.println("SingletonCounter = " + singletonCounter);

    singletonCounter = (Counter) context.getBean("singletonCounter");
    System.out.println("After second retrieve SingletonCounter = " + singletonCounter);
    singletonCounter.increment();
    System.out.println("SingletonCounter = " + singletonCounter);
    System.out.println("------------------------------------------------------------");
  }

  private static void runPrototypeBeanExample(ApplicationContext context) {
    Counter prototypeCounter = (Counter) context.getBean("prototypeCounter");

    System.out.println("-------------- Prototype Bean Scope Example ----------------");
    System.out.println("After first retrieve PrototypeCounter = " + prototypeCounter);
    prototypeCounter.increment();
    System.out.println("PrototypeCounter = " + prototypeCounter);
    prototypeCounter.increment();
    System.out.println("PrototypeCounter = " + prototypeCounter);

    prototypeCounter = (Counter) context.getBean("prototypeCounter");
    System.out.println("After second retrieve PrototypeCounter = " + prototypeCounter);
    prototypeCounter.increment();
    System.out.println("PrototypeCounter = " + prototypeCounter);
    System.out.println("------------------------------------------------------------");
  }
}
