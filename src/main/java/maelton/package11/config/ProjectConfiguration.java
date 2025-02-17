package maelton.package11.config;

import maelton.package11.beans.ManHeart;
import maelton.package11.beans.Woman;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
    @Bean
    public Woman woman() {
        Woman woman = new Woman();
        woman.setEyeColor("Light Brown");
        return woman;
    }

    @Bean
    public ManHeart manHeart(Woman woman) {
        ManHeart manHeart = new ManHeart();
        manHeart.setWoman(woman); //Wiring via method parameters
        return manHeart;
    }
}
