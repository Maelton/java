package maelton.package14;

import maelton.package14.beans.ManHeart;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("maelton.package14");
        context.refresh();

        ManHeart manHeart = context.getBean(ManHeart.class);

        System.out.println(manHeart.getWoman().getEyeColor());
    }
}
