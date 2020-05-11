package beanScopeAndLifecycle.App;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import beanScopeAndLifecycle.Classes.Coach;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeAndLifecycle/beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println(result);

        context.close();
    }
}
