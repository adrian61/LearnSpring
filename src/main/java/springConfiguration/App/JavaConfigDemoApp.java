package springConfiguration.App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springConfiguration.Class.Coach;
import springConfiguration.SportConfig;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
    }
}
