package annotations.App;

import annotations.Classes.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoApp {
    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");
        // get the bean from spring container
        Coach theCoach = context.getBean("trackCoach", Coach.class);
        Coach alphaCoach = context.getBean("trackCoach", Coach.class);
        // method on the bean
        System.out.println((theCoach==alphaCoach));

        // close the context
        context.close();
    }
}
