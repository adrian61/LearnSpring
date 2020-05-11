package springdemo.App;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.Coach;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println(result);

        context.close();
    }
}
