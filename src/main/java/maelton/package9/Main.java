package maelton.package9;

import maelton.package9.beans.Woman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myProjectBeans.xml");

        Woman darkBrownEyesWoman = context.getBean("darkBrownEyesWoman", Woman.class);

        System.out.println(darkBrownEyesWoman.getEyeColor());
    }
}
