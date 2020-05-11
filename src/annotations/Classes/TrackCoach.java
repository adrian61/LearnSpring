package annotations.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

//    @Autowired
//    public TrackCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }


    public TrackCoach() {
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("set method");
        this.fortuneService = fortuneService;
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
