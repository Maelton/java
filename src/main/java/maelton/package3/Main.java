package maelton.package3;

import maelton.package3.beans.Woman;
import maelton.package3.config.ProjectConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Woman primaryWoman = context.getBean(Woman.class);
        System.out.println(primaryWoman.getEyeColor());
    }
}
