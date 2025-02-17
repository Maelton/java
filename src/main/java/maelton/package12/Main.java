package maelton.package12;

import maelton.package12.beans.ManHeart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("maelton.package12");
        context.refresh();

        ManHeart manHeart = context.getBean(ManHeart.class);

        System.out.println(manHeart.getWoman().getEyeColor());
        System.out.println(manHeart.getMistress());
    }
}
