package springdemo;

public class TrackCoach implements Coach {
    //define a private filed for the dependency
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    //define a constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("init method");
    }

    // add a destroy method
    public void doMyStartupStuffDestroy() {
        System.out.println("destroy method");
    }
}
