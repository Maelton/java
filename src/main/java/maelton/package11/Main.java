package maelton.package11;

import maelton.package11.beans.ManHeart;
import maelton.package11.config.ProjectConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        ManHeart manHeart = context.getBean(ManHeart.class);

        System.out.println(manHeart.getWoman().getEyeColor());
    }
}
