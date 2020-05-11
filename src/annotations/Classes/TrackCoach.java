package annotations.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

//    @Autowired
//    public TrackCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }


    public TrackCoach() {
    }

    @Autowired
    @Qualifier("databaseFortuneService")
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
