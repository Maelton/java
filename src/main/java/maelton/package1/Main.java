package maelton.package1;

import maelton.package1.beans.Woman;
import maelton.package1.config.ProjectConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Woman woman = context.getBean(Woman.class);

        System.out.println(woman.getEyeColor());
    }
}
