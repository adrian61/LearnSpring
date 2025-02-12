package beanScopeAndLifecycle.Classes;

public class BaseballCoach implements Coach {
    //define a private filed for the dependency
    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
