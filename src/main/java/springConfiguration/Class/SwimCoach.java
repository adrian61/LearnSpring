package springConfiguration.Class;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
    private final FortuneService fortuneService;
    public SwimCoach(FortuneService fortuneService) {
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
