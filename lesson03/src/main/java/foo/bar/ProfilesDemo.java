package foo.bar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfilesDemo {


    public static void main(String[] args) {

      // Active profiles are set using JVM property -Dspring.profiles.active=<PROFILE_NAME>
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
      // TODO: uncomment for direct set of active profile
      //ctx.getEnvironment().setActiveProfiles("prod");
      //ctx.register(DemoConfig.class, ProdConfig.class);
      //ctx.refresh();

      CarService service = (CarService) ctx.getBean("carService");
      for (Car car : service.getAllCars()) {
        System.out.println(car);
      }
    }


}
