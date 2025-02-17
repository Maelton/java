package maelton.package19;

import maelton.package19.beans.Woman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("maelton.package19");
        context.refresh();

        Woman woman =  context.getBean(Woman.class);
        woman.setName("Felpa");
        System.out.println(woman.sayHello());
    }
}
