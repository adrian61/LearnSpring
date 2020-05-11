package annotations.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "track Coach here!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
