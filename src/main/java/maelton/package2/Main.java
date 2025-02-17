package maelton.package2;

import maelton.package2.beans.Woman;
import maelton.package2.config.ProjectConfiguration;

import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        try {
            Woman woman = context.getBean(Woman.class);
        } catch (NoUniqueBeanDefinitionException e) {
            System.out.println("Spring could not identify which bean to pick and thrown the `" + e.getClass() + "` exception");
            System.out.println();
        }

        Woman darkBrownEyesWoman = context.getBean("woman2", Woman.class);
        Woman blueEyesWoman = context.getBean("blueEyesWoman", Woman.class);
        //...

        System.out.println(darkBrownEyesWoman.getEyeColor());
        System.out.println();

        System.out.println(blueEyesWoman.getEyeColor());
        System.out.println();
    }
}
