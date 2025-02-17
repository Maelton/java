package maelton.package18;

import maelton.package18.beans.Woman;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("maelton.package18");
        context.refresh();

        Woman woman1 =  context.getBean(Woman.class);
        Woman woman2 =  context.getBean(Woman.class);

        System.out.println("Woman1 != Woman2 (Different objects) ? " + (woman1 != woman2));
    }
}
