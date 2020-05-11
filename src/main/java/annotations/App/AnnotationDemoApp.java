package annotations.App;

import annotations.Classes.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");
        // get the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // method on the bean
        System.out.println(theCoach.getDailyWorkout());
        // close the context
        context.close();
    }
}
