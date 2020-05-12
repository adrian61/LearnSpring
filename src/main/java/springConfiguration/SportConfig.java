package springConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springConfiguration.Class.*;

@Configuration
@ComponentScan("springConfiguration.Class")
public class SportConfig {
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
