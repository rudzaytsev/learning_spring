package baz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by rudolph on 02.05.18.
 */
public class BeanLifeCycleDemo {

  public static void main(String[] args) {
    //Puzzler
    //What should this program print and why?
    //How many BeanPostProcessor instances are working during the code execution?
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    MyBean bean = (MyBean) context.getBean("myBean");
    System.out.println(bean.getMessage());
    System.out.println(bean.getMessage2());
    context.registerShutdownHook();
  }
}
