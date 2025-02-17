package maelton.package4;

import maelton.package4.beans.Woman;
import maelton.package4.config.ProjectConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Woman woman = context.getBean(Woman.class);
        woman.setEyeColor("Dark Brown");

        System.out.println(woman.getEyeColor());
    }
}
