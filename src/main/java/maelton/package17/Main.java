package maelton.package17;

import maelton.package17.beans.Woman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("maelton.package17");
        context.refresh();

        System.out.println("Application started...");
        System.out.println("Before woman bean lazy instantiation");
        Woman woman1 =  context.getBean(Woman.class);
        System.out.println("After woman bean lazy instantiation");



    }
}
