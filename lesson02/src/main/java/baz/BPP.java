package baz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * Created by rudolph on 03.05.18.
 */
@Component
public class BPP implements BeanPostProcessor, Ordered {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("BPP postProcessBeforeInitialization called");
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    Field[] declaredFields = bean.getClass().getDeclaredFields();
    for (Field field : declaredFields) {
      if (field.isAnnotationPresent(Lucky.class)) {
        field.setAccessible(true);
        try {
          field.set(bean, "Lucky number is " + Math.round((Math.random() * 5) + 1));
        } catch (IllegalAccessException e) {
          e.printStackTrace();
        }
      }
    }
    System.out.println("BPP postProcessAfterInitialization called");
    return bean;
  }

  @Override
  public int getOrder() {
    return 42;
  }
}
