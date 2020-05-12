package annotations.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("singleton")
//@Scope("prototype") must be commented if used @PreDestroy
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

    @PostConstruct
    public void doSomething() {
        System.out.println("post construct");
    }

    @PreDestroy
    public void doSomethingDestroy() {
        System.out.println("pre destroy");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
