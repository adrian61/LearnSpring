package springConfiguration.Class;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    private final FortuneService fortuneService;
    @Autowired
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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
