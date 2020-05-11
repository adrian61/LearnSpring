package annotations.Classes;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "tennis Coach here!";
    }
}
