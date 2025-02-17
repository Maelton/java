package maelton.package10.config;

import maelton.package10.beans.ManHeart;
import maelton.package10.beans.Woman;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
    @Bean
    public Woman woman() {
        Woman woman = new Woman();
        woman.setEyeColor("Dark Brown");
        return woman;
    }

    @Bean
    public ManHeart manHeart() {
        ManHeart manHeart = new ManHeart();
        manHeart.setWoman(woman()); //Wiring via method call
        return manHeart;
    }
}
