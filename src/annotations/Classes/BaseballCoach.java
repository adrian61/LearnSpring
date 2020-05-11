package annotations.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Autowired
    public BaseballCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");

        fortuneService = theFortuneService;
    }



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
