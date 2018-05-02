package baz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by rudolph on 03.05.18.
 */
public class BPP2 implements BeanPostProcessor, Ordered {
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("BPP2 postProcessBeforeInitialization");
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("BPP2 postProcessAfterInitialization");
    return bean;
  }

  @Override
  public int getOrder() {
    return 37;
  }
}
