package maelton.package6;

import maelton.package6.beans.Woman;
import maelton.package6.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Woman woman = context.getBean(Woman.class);

        System.out.println(woman.getEyeColor());
    }
}
