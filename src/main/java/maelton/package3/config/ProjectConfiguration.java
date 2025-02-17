package maelton.package3.config;

import maelton.package3.beans.Woman;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfiguration {

    @Primary
    @Bean
    public Woman woman() {
        Woman woman = new Woman();
        woman.setEyeColor("Light Brown");
        return woman;
    }

    @Bean
    public Woman woman2() {
        Woman woman = new Woman();
        woman.setEyeColor("Dark Brown");
        return woman;
    }

    @Bean(name = "blueEyesWoman")
    public Woman woman3() {
        Woman woman = new Woman();
        woman.setEyeColor("Blue");
        return woman;
    }

    @Bean(value = "greenEyesWoman")
    public Woman woman4() {
        Woman woman = new Woman();
        woman.setEyeColor("Green");
        return woman;
    }

    @Bean("darkEyesWoman")
    public Woman woman5() {
        Woman woman = new Woman();
        woman.setEyeColor("Dark");
        return woman;
    }
}
