package maelton.package15.config;

import maelton.package15.beans.Woman;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "maelton.package15")
public class ProjectConfig {

    @Bean(name = "darkBrown")
    public Woman darkBrownEyesWoman() {
        Woman woman = new Woman();
        woman.setEyeColor("Dark Brown");
        return woman;
    }

    @Bean(name = "blue")
    public Woman blueEyesWoman() {
        Woman woman = new Woman();
        woman.setEyeColor("Blue");
        return woman;
    }

    @Bean(name = "green")
    public Woman greenEyesWoman() {
        Woman woman = new Woman();
        woman.setEyeColor("Green");
        return woman;
    }
}
