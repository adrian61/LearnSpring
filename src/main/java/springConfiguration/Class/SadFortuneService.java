package springConfiguration.Class;


import org.springframework.stereotype.Component;


public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your bad day";
    }
}
