package beanScopeAndLifecycle.App;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import beanScopeAndLifecycle.Classes.Coach;

public class SpringHelloApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeAndLifecycle/applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        // call method for fortunes
        System.out.println(theCoach.getDailyFortune());
        // close the context
        context.close();
    }
}
