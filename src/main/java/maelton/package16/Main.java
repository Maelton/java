package maelton.package16;

import maelton.package16.beans.Woman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("maelton.package16");
        context.refresh();

        Woman woman1 =  context.getBean(Woman.class);
        Woman woman2 =  context.getBean(Woman.class);

        System.out.println("Woman1 == Woman2 (Same object) ? " + (woman1 == woman2));
    }
}
