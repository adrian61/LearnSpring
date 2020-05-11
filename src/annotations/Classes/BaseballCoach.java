package annotations.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;




    public BaseballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "baseball Coach here!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
